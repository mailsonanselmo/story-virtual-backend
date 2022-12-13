package br.com.storyvirtual.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.storyvirtual.entity.Estado;
import br.com.storyvirtual.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;
    
    public List<Estado> buscarTodos(){
        return estadoRepository.findAll();
    } 

    public Estado inserir(Estado estado){
        estado.setDataHoraCadastro(new Date());
        return estadoRepository.saveAndFlush(estado);
    }

    public Estado alterar(Estado estado){
        estado.setDataAtualizacao(new Date());
        return estadoRepository.saveAndFlush(estado);
    }

    public void excluir(Long id){
        Estado estado = estadoRepository.findById(id).get();
        estadoRepository.delete(estado);
    }

}
