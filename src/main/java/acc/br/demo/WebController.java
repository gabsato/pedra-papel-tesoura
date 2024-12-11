package acc.br.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	@Autowired
	public ScoreRepository scoreRepo;
	
	@ResponseBody
	@GetMapping("/score")
	public Score getScore() {
		Score score;
		try {
			score = scoreRepo.findById(1).get();
		} catch(Exception e) {
			score = new Score(0,0,0);
			scoreRepo.save(score);
		}
		return score;
	}
	
	
	@GetMapping("/teste")
	public String teste(@RequestParam(name="escolha")String aEscolha, Model model) {
		Score score = getScore();
		String saida = "empatou";
		if(aEscolha.equalsIgnoreCase("papel")) {
			saida = "ganhou";
			score.setVitorias(score.getVitorias() + 1);
		}else if (aEscolha.equalsIgnoreCase("tesoura")){
			saida = "perdeu";
			score.setDerrotas(score.getDerrotas() + 1);
		} else {
			score.setEmpates(score.getEmpates() + 1);
		}
		
		scoreRepo.save(score);
		model.addAttribute("saida", saida);
		model.addAttribute("aEscolha", aEscolha);
		model.addAttribute("score", score);
		
		return  "resultado";
	}
	
	@PostMapping("/reset")
	public String resetScore(Model model) {
		Score score = getScore();
		score.reset();
		scoreRepo.save(score);
		model.addAttribute("score", score);
		
		return "resultado";
	}
	
	
}
