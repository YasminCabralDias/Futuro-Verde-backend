package br.com.fiap.futuroverde.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.futuroverde.models.Usuario;
import br.com.fiap.futuroverde.repository.UsuarioRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void run (String... args) throws Exception {
        usuarioRepository.save(new Usuario(1, "yasmin", "yasmin@gmail.com", "1234567"));
    }
}
