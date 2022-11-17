package p2.FINANCING;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.PathVariable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.var;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Financing {

	@Id
	private long cpf;

	private String nome;

	private String endereco;

	private double valorfinanciamento;

	private long rg;

}
