package midi.model;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.File;

public class midi extends Application {

    MediaPlayer player;

    public static void main(String[] args){
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane=new BorderPane();
        GridPane pane= new GridPane();

        makeButtons(pane);
        HBox bar= new HBox();
        bar.getChildren().add(new Button("File"));

        mainPane.setTop(bar);
        mainPane.setCenter(pane);

        Scene scene= new Scene(mainPane);
        primaryStage.setTitle("Midi Fighter");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void makeButtons(GridPane pane){
        //these change whats on the board
        Button top1=makeTopButton();
        Button top2= makeTopButton();
        Button top3= makeTopButton();
        Button top4= makeTopButton();

        Button btn1= makeButton("src/sounds/cabasa_hit.mp3",
                Color.RED);
        Button btn2= makeButton("src/sounds/hand_clap.wav",
                Color.ORANGE);
        Button btn3= makeButton("src/sounds/snare_hit.wav",
                Color.YELLOW);
        Button btn4= makeButton("src/sounds/melodic dubstep.wav",
                Color.GREEN);
        Button btn5= makeButton("src/sounds/vocal_scratch.wav",
                Color.BLUE);
        Button btn6= makeButton("src/sounds/xylophone.wav",
                Color.INDIGO);
        Button btn7= makeButton("src/sounds/organ.wav",
                Color.VIOLET);
        Button btn8= makeButton("src/sounds/happy_waves.wav",
                Color.PINK);
        Button btn9= makeButton("src/sounds/analog bass.wav",Color.LIGHTBLUE);
        Button btn10= makeButton("src/sounds/analog bass.wav",Color.GOLD);

        Button btn11= makeButton("src/sounds/analog bass.wav", Color.CRIMSON);
        Button btn12= makeButton("src/sounds/analog bass.wav",Color.LIGHTGREEN);
        Button btn13= makeButton("src/sounds/analog bass.wav",Color.DARKMAGENTA);
        Button btn14= makeButton("src/sounds/analog bass.wav",Color.BROWN);
        Button btn15= makeButton("src/sounds/analog bass.wav",Color.HONEYDEW);
        Button btn16= makeButton("src/sounds/analog bass.wav",Color.PLUM);

        pane.add(top1,0,0);
        pane.add(top2,1,0);
        pane.add(top3,2,0);
        pane.add(top4,3,0);

        pane.add(btn1,0,1);
        pane.add(btn2,1,1);
        pane.add(btn3,2,1);
        pane.add(btn4,3,1);
        pane.add(btn5,0,2);
        pane.add(btn6,1,2);
        pane.add(btn7,2,2);
        pane.add(btn8,3,2);
        pane.add(btn9,0,3);
        pane.add(btn10,1,3);
        pane.add(btn11,2,3);
        pane.add(btn12,3,3);
        pane.add(btn13,0,4);
        pane.add(btn14,1,4);
        pane.add(btn15,2,4);
        pane.add(btn16,3,4);

        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(15,15,15,15));
        pane.setStyle("-fx-background-color: #3d3d3d; ");


    }


    public Button makeTopButton(){
        Button btn= new Button();
        btn.setPrefHeight(10);
        btn.setPrefWidth(100);
        btn.setMaxHeight(10);
        btn.setMaxWidth(100);
        btn.setPadding(new Insets(10,10,10,10));


//        Media sound= new Media(new File(musicFile).toURI().toString());
//
//        btn.setOnAction(event-> {
//            player= new MediaPlayer(sound);
//            player.play();
//            btn.setStyle("-fx-background-color: #000000; ");
//            //something that sets the button color back to whatever
//        });
        return btn;
    }

    public Button makeButton(String musicFile,Color color){
        Button btn= new Button();
        btn.setShape(new Circle(50));
        btn.setPrefHeight(100);
        btn.setPrefWidth(100);
        btn.setMaxHeight(100);
        btn.setMaxWidth(100);
        btn.setPadding(new Insets(10,10,10,10));
        btn.setStyle("-fx-background-color: #3d3d3d; ");
        btn.setBorder(new Border(new BorderStroke(Color.GRAY,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));


        Media sound= new Media(new File(musicFile).toURI().toString());

        btn.setOnAction(event-> {
            player= new MediaPlayer(sound);
            player.play();
            btn.setBorder(new Border(new BorderStroke(color,
                    BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            //something that sets the button color back to whatever
        });
        return btn;
    }


    public void init(){}


}
