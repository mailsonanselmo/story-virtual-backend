package br.com.storyvirtual.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.storyvirtual.entity.Cidade;
import br.com.storyvirtual.repository.CidadeRepository;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;
    
    public List<Cidade> buscarTodos(){
        return cidadeRepository.findAll();
    } 

    public Cidade inserir(Cidade cidade){
        cidade.setDataHoraCadastro(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }

    public Cidade alterar(Cidade cidade){
        cidade.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }

    public void excluir(Long id){
        Cidade cidade = cidadeRepository.findById(id).get();
        cidadeRepository.delete(cidade);
    }

}
