package com.books.model;

import java.util.ArrayList;
import java.util.List;

public class BookExpert {
	public List<String> cardText;
	public List<String> imagePath;
	public List<String> shopPath;
	public List<String> getBooks(String bookType)
	{
		List<String> books = new ArrayList<String>();
		cardText = new ArrayList<String>();
		imagePath = new ArrayList<String>();
		shopPath = new ArrayList<String>();
		
		if(bookType.equals("Action and Adventure"))
		{
			books.add("Life of Pi");
			books.add("The Three Musketeers");
			books.add("The Call of the Wild");
			
			cardText.add("amazon.com <br> $8.99");
			cardText.add("amazon.com <br> $14.99");
			cardText.add("amazon.com <br> $6.50");
			
			imagePath.add("bookimages/1A.png");
			imagePath.add("bookimages/1B.png");
			imagePath.add("bookimages/1C.png");
			
			shopPath.add("https://www.amazon.com/dp/0156027321?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://go.skimresources.com/?id=74968X1583755&isjs=1&jv=14.2.0-stackpath&sref=https%3A%2F%2Fwww.oprahmag.com%2Fentertainment%2Fbooks%2Fa29576863%2Ftypes-of-book-genres%2F&url=https%3A%2F%2Fwww.amazon.com%2Fdp%2F1505234727%3Fots%3D1%26linkCode%3Dogi%26tag%3Doprah-auto-20%26ascsubtag%3D%5Bartid%7C10072.a.29576863%5Bsrc%7C%5Bch%7C%5Blt%7C&xguid=ee5452a1c7ce7e1d9a84cc876d1002bb&xs=1&xtz=-330&xuuid=9944ad878afbc2d3f044af637f39b323&xjsf=other_click__contextmenu%20%5B2%5D");
			shopPath.add("https://www.amazon.com/dp/151239582X?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
		}
		else if(bookType.equals("Classics"))
		{
			books.add("To Kill a Mockingbird");
			books.add("Little Women");
			books.add("Beloved");
		
			cardText.add("amazon.com <br> $7.19");
			cardText.add("amazon.com <br> $18.59");
			cardText.add("amazon.com <br> $12.19");
			
			imagePath.add("bookimages/2A.png");
			imagePath.add("bookimages/2B.png");
			imagePath.add("bookimages/2C.png");
			
			shopPath.add("https://www.amazon.com/dp/0060935464?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://go.skimresources.com/?id=74968X1583755&isjs=1&jv=14.2.0-stackpath&sref=https%3A%2F%2Fwww.oprahmag.com%2Fentertainment%2Fbooks%2Fa29576863%2Ftypes-of-book-genres%2F&url=https%3A%2F%2Fwww.amazon.com%2Fdp%2F0316489271%3Fots%3D1%26linkCode%3Dogi%26tag%3Doprah-auto-20%26ascsubtag%3D%5Bartid%7C10072.a.29576863%5Bsrc%7C%5Bch%7C%5Blt%7Csale&xguid=ee5452a1c7ce7e1d9a84cc876d1002bb&xs=1&xtz=-330&xuuid=9944ad878afbc2d3f044af637f39b323&xjsf=other_click__contextmenu%20%5B2%5D");
			shopPath.add("https://www.amazon.com/dp/1400033411?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Comic Book or Graphic Novel"))
		{
			books.add("Watchmen");
			books.add("The Walking Dead: Compendium One");
			books.add("The Boy, the Mole, the Fox and the Horse");
		
			cardText.add("amazon.com <br> $14.99");
			cardText.add("amazon.com <br> $29.98");
			cardText.add("amazon.com <br> $13.59");
			
			imagePath.add("bookimages/3A.png");
			imagePath.add("bookimages/3B.png");
			imagePath.add("bookimages/3C.png");
			
			shopPath.add("https://www.amazon.com/dp/1779501129?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/1607060760?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0062976583?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Detective and Mystery"))
		{
			books.add("The Night Fire");
			books.add("The Adventures of Sherlock Holmes");
			books.add("And Then There Were None");
		
			cardText.add("amazon.com <br> $14.49");
			cardText.add("amazon.com <br> $7.99");
			cardText.add("amazon.com <br> $7.99");
			
			imagePath.add("bookimages/4A.png");
			imagePath.add("bookimages/4B.png");
			imagePath.add("bookimages/4C.png");
			
			shopPath.add("https://www.amazon.com/dp/0316485616?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/1508475318?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/0062073486?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
		}
		else if(bookType.equals("Fantasy"))
		{
			books.add("The Water Dancer");
			books.add("Circe");
			books.add("Ninth House");
		
			cardText.add("amazon.com <br> $16.80");
			cardText.add("amazon.com <br> $11.99");
			cardText.add("amazon.com <br> $16.78");
			
			imagePath.add("bookimages/5A.png");		
			imagePath.add("bookimages/5B.png");
			imagePath.add("bookimages/5C.png");
			
			shopPath.add("https://www.amazon.com/dp/0399590595?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/B074M5TLLJ?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/1250313074?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Historical Fiction"))
		{
			books.add("The Help");
			books.add("One Hundred Years of Solitude");
			books.add("Memoirs of a Geisha");
		
			cardText.add("amazon.com <br> $10.75");
			cardText.add("amazon.com <br> $9.99");
			cardText.add("amazon.com <br> $6.89");
			
			imagePath.add("bookimages/6A.png");
			imagePath.add("bookimages/6B.png");
			imagePath.add("bookimages/6C.png");
			
			shopPath.add("https://www.amazon.com/dp/0399155341?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0060883286?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0679781587?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Horror"))
		{
			books.add("Carrie");
			books.add("The Haunting of Hill House");
			books.add("Bird Box");
		
			cardText.add("amazon.com <br> $6.79");
			cardText.add("amazon.com <br> $11.79");
			cardText.add("amazon.com <br> $12.19");
			
			imagePath.add("bookimages/7A.png");
			imagePath.add("bookimages/7B.png");
			imagePath.add("bookimages/7C.png");
			
			shopPath.add("https://www.amazon.com/dp/0307743667?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0143039989?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/B00FJ352U6?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
		}
		else if(bookType.equals("Literary Fiction"))
		{
			books.add("Where the Crawdads Sing");
			books.add("Olive, Again");
			books.add("The Dutch House: A Novel");
		
			cardText.add("amazon.com <br> $9.59");
			cardText.add("amazon.com <br> $14.99");
			cardText.add("amazon.com <br> $16.95");
			
			imagePath.add("bookimages/8A.png");
			imagePath.add("bookimages/8B.png");
			imagePath.add("bookimages/8C.png");
			
			shopPath.add("https://www.amazon.com/dp/0735219095?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/B07NCPLS2R?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/0062963678?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Romance"))
		{
			books.add("Brazen and the Beast");
			books.add("Royal Holiday");
			books.add("The Savior");
		
			cardText.add("amazon.com <br> $6.99");
			cardText.add("amazon.com <br> $10.00");
			cardText.add("amazon.com <br> $7.99");
			
			imagePath.add("bookimages/9A.png");
			imagePath.add("bookimages/9B.png");
			imagePath.add("bookimages/9C.png");
			
			shopPath.add("https://www.amazon.com/dp/B07D6P4JK7?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/1984802216?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/B07HWZKL94?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
		}
		else if(bookType.equals("Science Fiction (Sci-Fi)"))
		{
			books.add("The Testaments");
			books.add("The Hunger Games Trilogy");
			books.add("1984");
		
			cardText.add("amazon.com <br> $17.28");
			cardText.add("amazon.com <br> $25.99");
			cardText.add("amazon.com <br> $15.90");
			
			imagePath.add("bookimages/10A.png");
			imagePath.add("bookimages/10B.png");
			imagePath.add("bookimages/10C.png");
			
			shopPath.add("https://www.amazon.com/dp/0385543786?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/B004XJRQUQ?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/1328869334?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Short Stories"))
		{
			books.add("This Is How You Lose Her");
			books.add("Florida");
			books.add("How Long til Black Future Month?");
		
			cardText.add("amazon.com <br> $9.99");
			cardText.add("amazon.com <br> $10.59");
			cardText.add("amazon.com <br> $17.89");
			
			imagePath.add("bookimages/11A.png");
			imagePath.add("bookimages/11B.png");
			imagePath.add("bookimages/11C.png");
			
			shopPath.add("https://go.skimresources.com/?id=74968X1583755&isjs=1&jv=14.2.0-stackpath&sref=https%3A%2F%2Fwww.oprahmag.com%2Fentertainment%2Fbooks%2Fa29576863%2Ftypes-of-book-genres%2F&url=https%3A%2F%2Fwww.amazon.com%2Fdp%2F1594631778%3Fots%3D1%26linkCode%3Dogi%26tag%3Doprah-auto-20%26ascsubtag%3D%5Bartid%7C10072.a.29576863%5Bsrc%7C%5Bch%7C%5Blt%7Csale&xguid=ee5452a1c7ce7e1d9a84cc876d1002bb&xs=1&xtz=-330&xuuid=9944ad878afbc2d3f044af637f39b323&xjsf=other_click__contextmenu%20%5B2%5D");
			shopPath.add("https://www.amazon.com/dp/1594634521?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0316491349?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Suspense and Thrillers"))
		{
			books.add("Gone Girl");
			books.add("The 19th Christmas");
			books.add("The Guardians");
		
			cardText.add("amazon.com <br> $9.99");
			cardText.add("amazon.com <br> $14.99");
			cardText.add("amazon.com <br> $17.04");
			
			imagePath.add("bookimages/12A.png");
			imagePath.add("bookimages/12B.png");
			imagePath.add("bookimages/12C.png");
			
			shopPath.add("https://www.amazon.com/dp/0307588378?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/B07P1SSF9S?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/0385544189?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Women's Fiction"))
		{
			books.add("My Sister, the Serial Killer");
			books.add("The Queen of Hearts");
			books.add("Red at the Bone");
		
			cardText.add("amazon.com <br> $20.95");
			cardText.add("amazon.com <br> $10.69");
			cardText.add("amazon.com <br> $14.99");
			
			imagePath.add("bookimages/13A.png");
			imagePath.add("bookimages/13B.png");
			imagePath.add("bookimages/13C.png");
			
			shopPath.add("https://www.amazon.com/dp/0385544235?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/0399585893?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/B07PMZZX2Z?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
		}
		else if(bookType.equals("Biographies and Autobiographies"))
		{
			books.add("Me");
			books.add("Frida");
			books.add("I Know Why the Caged Bird Sings");
		
			cardText.add("amazon.com <br> $11.58");
			cardText.add("amazon.com <br> $24.99");
			cardText.add("amazon.com <br> $15.70");
			
			imagePath.add("bookimages/14A.png");
			imagePath.add("bookimages/14B.png");
			imagePath.add("bookimages/14C.png");
			
			shopPath.add("https://www.amazon.com/dp/1250147603?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0060085894?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/0812980026?ots=1&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
		}
		else if(bookType.equals("Cookbooks"))
		{
			books.add("Cravings: Hungry for More");
			books.add("The Jemima Code");
			books.add("Mastering the Art of French Cooking, Volume 1");
		
			cardText.add("amazon.com <br> $10.99");
			cardText.add("amazon.com <br> $40.50");
			cardText.add("amazon.com <br> $22.99");
			
			imagePath.add("bookimages/15A.png");
			imagePath.add("bookimages/15B.png");
			imagePath.add("bookimages/15C.png");
			
			shopPath.add("https://www.amazon.com/dp/1524759724?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0292745486?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/B004ZZFMTK?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
		}
		else if(bookType.equals("Essays"))
		{
			books.add("Notes of a Native Son");
			books.add("Bad Feminist");
			books.add("The Source of Self-Regard");
		
			cardText.add("amazon.com <br> $11.99");
			cardText.add("amazon.com <br> $14.39");
			cardText.add("amazon.com <br> $16.66");
			
			imagePath.add("bookimages/16A.png");
			imagePath.add("bookimages/16B.png");
			imagePath.add("bookimages/16C.png");
			
			shopPath.add("https://www.amazon.com/dp/0807006238?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0062282719?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0525521038?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("History"))
		{
			books.add("John Adams");
			books.add("1776");
			books.add("The Six Wives of Henry VIII");
		
			cardText.add("amazon.com <br> $13.99");
			cardText.add("amazon.com <br> $13.50");
			cardText.add("amazon.com <br> $11.99");
			
			imagePath.add("bookimages/17A.png");
			imagePath.add("bookimages/17B.png");
			imagePath.add("bookimages/17C.png");
			
			shopPath.add("https://www.amazon.com/dp/0743223136?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0743226712?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0802136834?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Memoir"))
		{
			books.add("Born a Crime");
			books.add("Becoming");
			books.add("The Glass Castle");
		
			cardText.add("amazon.com <br> $13.87");
			cardText.add("amazon.com <br> $11.89");
			cardText.add("amazon.com <br> $7.79");
			
			imagePath.add("bookimages/18A.png");
			imagePath.add("bookimages/18B.png");
			imagePath.add("bookimages/18C.png");
			
			shopPath.add("https://www.amazon.com/dp/052550902X?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/1524763136?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/074324754X?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Poetry"))
		{
			books.add("Sylvia Plath: The Collected Poems");
			books.add("The Sun and Her Flowers");
			books.add("There Are More Beautiful Things Than Beyoncé");
		
			cardText.add("amazon.com <br> $13.99");
			cardText.add("amazon.com <br> $8.75");
			cardText.add("amazon.com <br> $12.59");
			
			imagePath.add("bookimages/19A.png");
			imagePath.add("bookimages/19B.png");
			imagePath.add("bookimages/19C.png");
			
			shopPath.add("https://www.amazon.com/dp/0061558893?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/1449486797?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/1941040535?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("Self-Help"))
		{
			books.add("Everything Is F*cked");
			books.add("Dare to Lead");
			books.add("The Secret");
		
			cardText.add("amazon.com <br> $13.49");
			cardText.add("amazon.com <br> $13.09");
			cardText.add("amazon.com <br> $9.59");
			
			imagePath.add("bookimages/20A.png");
			imagePath.add("bookimages/20B.png");
			imagePath.add("bookimages/20C.png");
			
			shopPath.add("https://www.amazon.com/dp/0062888439?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/1785042149?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|");
			shopPath.add("https://www.amazon.com/dp/1582701709?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else if(bookType.equals("True Crime"))
		{
			books.add("Catch and Killd");
			books.add("I'll Be Gone in the Dark");
			books.add("Helter Skelter");
		
			cardText.add("amazon.com <br> $6.09");
			cardText.add("amazon.com <br> $17.17");
			cardText.add("amazon.com <br> $10.99");
			
			imagePath.add("bookimages/21A.png");
			imagePath.add("bookimages/21B.png");
			imagePath.add("bookimages/21C.png");
			
			shopPath.add("https://www.amazon.com/dp/0316486639?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0062319787?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
			shopPath.add("https://www.amazon.com/dp/0393322238?ots=1&linkCode=ogi&tag=oprah-auto-20&ascsubtag=[artid|10072.a.29576863[src|[ch|[lt|sale");
		}
		else {
			return books;
		}
		
		return books;
	}
}
