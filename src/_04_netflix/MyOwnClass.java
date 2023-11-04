package _04_netflix;

public class MyOwnClass {
public static void main(String[] args) {
	Movie movie1=new Movie("movie1",4);
	Movie movie2=new Movie("movie2",3);
	Movie movie3=new Movie("movie3",5);
	Movie movie4=new Movie("movie4",2);
	Movie movie5=new Movie("movie5",1);
	NetflixQueue nq=new NetflixQueue();
	movie1.getTicketPrice();
	nq.addMovie(movie1);
	nq.addMovie(movie2);
	nq.addMovie(movie3);
	nq.addMovie(movie4);
	nq.addMovie(movie5);
	nq.printMovies();
	System.out.println("The best movie is "+ nq.getBestMovie());
	System.out.println("The second best movie is "+nq.getMovie(1));
}
}
