package ibf.day17.day17;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ibf.day17.day17.services.GiphyService;

@SpringBootApplication
public class Day17Application implements CommandLineRunner {

	@Autowired
	private GiphyService giphySvc;

	public static void main(String[] args) {
		SpringApplication.run(Day17Application.class, args);
	}

	@Override
	public void run(String... args) {
		/*
		List<GiphyImage> images = giphySvc.search("polar bear");
		System.out.printf(">>> images: %s\n", images);
		System.exit(0);
		*/
	}

}