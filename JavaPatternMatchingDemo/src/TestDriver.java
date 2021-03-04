import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDriver {

	public static void main(String[] args) {
		
		System.out.println("Hello Radhe Krishna...!");

		Pattern pattern = Pattern.compile("Keyur|Denish|keyur|denish");
		String str = "keyur and Denish are Good Friends.";
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			System.out.println("Start : "+matcher.start());
			System.out.println("End : "+matcher.end());
			System.out.println("Group : "+matcher.group());
		}
		
		System.out.println("================");
		
		String lines[] = {"Hello","Hi","good Night","hi Good Morninig","Hi Good Morning","Hello How are you?","2712"};
		List<String> linesList = Arrays.asList(lines);
		
		
		
		linesList.forEach(line->{
			//Pattern patt = Pattern.compile("^[H|h]"); // start with H or h
			//Pattern patt = Pattern.compile(".+g$"); // end with g
			//Pattern patt = Pattern.compile("[gG]ood"); // end with g
			Pattern patt = Pattern.compile("^Night"); // end with g
			Matcher match = patt.matcher(line);
			if(match.find())
				System.out.println(line);
		});
		
		System.out.println("Done...!");
	}

}
