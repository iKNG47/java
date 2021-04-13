package thirdHomework;

public class Request3_1 {
    public static void main(String[] args) {
        Request3 game1= new Request3();
        game1.title="The elder scroll V: Skyrim ";
        game1.rating=8.9;
        Request3 game2=game1;
        

        System.out.println(game1.title +" "+ game2.title+" "+ game1.rating +" "+ game2.rating);
    }

}
