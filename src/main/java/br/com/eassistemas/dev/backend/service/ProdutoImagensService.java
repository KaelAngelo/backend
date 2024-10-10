package br.com.eassistemas.dev.backend.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.eassistemas.dev.backend.entity.Produto;
import br.com.eassistemas.dev.backend.entity.ProdutoImagens;
import br.com.eassistemas.dev.backend.repository.ProdutoImagensRepository;
import br.com.eassistemas.dev.backend.repository.ProdutoRepository;

@Service
public class ProdutoImagensService {
    
    @Autowired
    private ProdutoImagensRepository produtoImagensRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    //buscar
    public List<ProdutoImagens> buscarTodos(){
        return produtoImagensRepository.findAll();
    }
    //inserir
    public ProdutoImagens inserir(Long idProduto, MultipartFile file){

        Produto produto = produtoRepository.findById(idProduto).get();
        ProdutoImagens novaImagem = new ProdutoImagens();

        try{
            
            if(!file.isEmpty()){

                byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(produto.getId())+file.getOriginalFilename();
                Path caminho = Paths.get("C:/Users/ezequielangelo/Projeto_Worspace/imagens/"+nomeImagem);
                Files.write(caminho, bytes);
                novaImagem.setNome(nomeImagem);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        novaImagem.setProduto(produto);
        novaImagem.setDataCriacao(new Date());
        novaImagem = produtoImagensRepository.saveAndFlush(novaImagem);

        return novaImagem;
    }
    //alterar
    public ProdutoImagens alterar(ProdutoImagens produtoImagens){
        produtoImagens.setDataAtualizacao(new Date());
        return produtoImagensRepository.saveAndFlush(produtoImagens);
    }

    //excluir
    public void excluir(Long id){
        ProdutoImagens imagem = produtoImagensRepository.findById(id).get();
        produtoImagensRepository.delete(imagem);
    }
}
