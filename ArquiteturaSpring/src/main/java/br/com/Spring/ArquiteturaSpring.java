package br.com.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import br.com.Model.Pessoa;

@Controller
public class ArquiteturaSpring {

	@RequestMapping("/chamarOK")
	public String chamarPagina(){
		//O retorno do tipo String redireciona para uma pagina com o nome da String retornada
		return "ok";
	}
	
	@RequestMapping(value="/retornarObjeto", method=RequestMethod.POST, produces = "application/json")
	public  @ResponseBody String retornarObjeto(Pessoa pessoa){
		if(pessoa.getIdade()>=18){
			pessoa.setNome(pessoa.getNome()+" Maior de idade da Silva");
		}
		Gson gson = new Gson();
		System.out.println("Param:"+pessoa.getNome());
		String resposta = gson.toJson(pessoa);
		System.out.println(resposta);
		return resposta;
	}
	
}
