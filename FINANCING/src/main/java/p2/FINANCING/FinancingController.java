package p2.FINANCING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import lombok.Data;

@RestController
@RequestMapping("/financing")
@Data
public class FinancingController {

	@Autowired
	private SerasaClient serasaClient;

	@PostMapping
	public ResponseEntity<Financing> criarNovaConta(@RequestBody Financing novoFinanciamento) {

		int resultado = serasaClient.temNomeSujo(novoFinanciamento.getCpf());
		System.out.println(resultado);

		return new ResponseEntity<Financing>(novoFinanciamento, HttpStatus.CREATED);
	}

}
