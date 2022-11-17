package p2.VERIFICADORSERASA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serasa")
public class VerificadorSerasaController {

	@GetMapping("/{cpf}")
	public int temNomeSujo(@PathVariable long cpf) {

		System.out.println("analisando cpf: " + cpf);

		int nomeSujo = 201;

		if (cpf == 123456) {
			nomeSujo = 204;
		}

		return nomeSujo;
	}
}
