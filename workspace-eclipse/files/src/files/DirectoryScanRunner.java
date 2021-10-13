package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {

		// ".";

		Path dir = Paths.get(".");
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");

		// Files.list(dir).forEach(System.out::println);
//		Files.walk(dir, 3).filter(predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");

		Files.find(dir, 4, matcher).forEach(System.out::println);

	}

}
