package br.com.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.Model.Aluno;
import br.com.Model.Pessoa;

@Controller
@RequestMapping("pessoas")
public class RetornoController {

	@RequestMapping(value = "/teste")
	public @ResponseBody Aluno teste() {
		Aluno aluno = new Aluno();
		aluno.setRg("leandro@dsgdg");
		aluno.setNome("leandro");
		return aluno;
	}

	Pessoa pessoa = new Pessoa();

	@RequestMapping(value = "/{name}/{email}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Pessoa getEmployeeInJSON(@PathVariable("name") String name, @PathVariable("email") String email) {

		pessoa.setName(name);
		pessoa.setEmail(name + "@"+email+".com");

		return pessoa;

	}

	@RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
	public @ResponseBody Pessoa getEmployeeInXML(@PathVariable String name) {

		pessoa.setName(name);
		pessoa.setEmail(name + "@fabricaDeMonstro.com");

		return pessoa;

	}

}
