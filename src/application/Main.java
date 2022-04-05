package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application implements EventHandler<ActionEvent> {
	/*
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Text messageText = new Text("Hello World! Lets learn JavaFX.");
			StackPane root = new StackPane();  // layout avec 5 zones
			
			root.getChildren().add(messageText);
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	/*
	@Override    
    public void start(Stage primaryStage) throws Exception { 
         
  /*
        Label label = new Label("A StackPane Example"); 
        label.setFont(new Font(30)); 
   
        // Creates a YELLOW Circle
        Circle circle = new Circle(100, 100, 70); 
        circle.setFill(Color.RED); 
   
        // Creates a BLUE Rectangle 
        Rectangle rectangle = new Rectangle(100, 100, 300, 160); 
        rectangle.setFill(Color.AQUA); 
   
         
        StackPane layout = new StackPane(rectangle, circle,label); */
		/*
		TextField textfield = new TextField(); 
		textfield.setMaxWidth(100);
		 
		StackPane layout = new StackPane(textfield); 
 
        Scene scene = new Scene(layout, 400, 250);  
 
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();    
    }*/
	
	/*
	 @Override    
	    public void start(Stage primaryStage) throws Exception { 
	         
	        Label label1 = new Label("Center section");
	        Label label2 = new Label("Top-most section");
	        Label label3 = new Label("Right section");
	        Label label4 = new Label("Bottom section");
	        Label label5 = new Label("Left section");
	             
	        BorderPane layout = new BorderPane(label1, label2, label3, label4, label5);
	        //layout.setPadding(new Insets(5, 5, 5, 5));  


	        layout.setAlignment(label2, Pos.CENTER); 
	        layout.setAlignment(label3, Pos.CENTER); 
	        layout.setAlignment(label4, Pos.CENTER); 
	        layout.setAlignment(label5, Pos.CENTER); 
	        Scene scene = new Scene(layout, 700, 400);  
	 
	        primaryStage.setTitle("CodersLegacy");
	        primaryStage.setScene(scene);   
	        primaryStage.show();    
	    }*/
	
	/*
	@Override    
    public void start(Stage primaryStage) throws Exception { 
     
        Button Button1 = new Button("Button1"); 
        Button Button2 = new Button("Button2"); 
        //Button Button3 = new Button("Button3"); 
             
        VBox layout = new VBox(Button1);
        
        layout.getChildren().add(Button2);
        
        layout.setAlignment(Pos.CENTER);
        
        
        
        Scene scene = new Scene(layout, 300, 300);  
 
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();    
    }
	*/
	
	Button button;
	Button button2;
	@Override    
    public void start(Stage primaryStage) throws Exception { 
       /*
		VBox layout = new VBox();
         
        
        Text text = new Text("This is a JavaFX Text example");
        text.setY(100);
        text.setX(50);
        text.setFill(Color.RED);
        
        Scene scene = new Scene(layout, 300, 300);
         
        button = new Button("Java FX");
        
        button.setStyle("-fx-border-color: yellow; -fx-text-fill: blue; -fx-border-width: 3px; -fx-font-size: 30px;");
       
        button2 = new Button("Un autre Bouton");
        
        button.setOnAction(this);
        button2.setOnAction(this);
        layout.getChildren().addAll(text,button,button2);
         
        
        TextField textF = new TextField();
        layout.getChildren().addAll(textF);
        
        
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();
        */
		/*
		VBox layout = new VBox();
        Scene scene = new Scene(layout, 250, 150);  
         
        CheckBox check1 = new CheckBox("Option 1");
        CheckBox check2 = new CheckBox("Option 2");
         
        layout.getChildren().addAll(check1, check2);
     
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();*/
		/*
		 VBox layout = new VBox();
	        Scene scene = new Scene(layout, 250, 150);  
	        
	        TextField text = new TextField();
	         
	        CheckBox check1 = new CheckBox("Option 1");
	        CheckBox check2 = new CheckBox("Option 2");
	             
	        Button button = new Button("Submit");
	        button.setOnAction(
	        		
	        		e -> {
	        			
	        			if(check1.isSelected())
	        			{
	        				 System.out.println("Vous avez choisi " + check1.getText());
	        				 System.out.println("Vous avez écrit " + text.getText());
	        			}}
	        		);
	              
	        layout.getChildren().addAll(check1, check2, text, button);
	     
	        primaryStage.setTitle("CodersLegacy");
	        primaryStage.setScene(scene);   
	        primaryStage.show();*/
		
		
		// Les radios buttons
		/*
		VBox layout = new VBox();
        Scene scene = new Scene(layout, 250, 150);  
         
        RadioButton radio1 = new RadioButton("Option 1");
        RadioButton radio2 = new RadioButton("Option 2");
         
        ToggleGroup radioGroup = new ToggleGroup();
        radio1.setToggleGroup(radioGroup);
        radio2.setToggleGroup(radioGroup);
         
        Button button = new Button("Submit");
        button.setOnAction(e -> {
            RadioButton temp = (RadioButton) radioGroup.getSelectedToggle();
            System.out.println(temp.getText());
        });
             
        layout.getChildren().addAll(radio1, radio2, button);
     
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();
		*/
		
		// Les passwords
		/*PasswordField password = new PasswordField();
        password.setMaxWidth(120);
     
        VBox layout = new VBox(password);
        layout.setPadding(new Insets(20, 20, 20, 20));  
      
        Scene scene = new Scene(layout, 200, 200);  
 
        primaryStage.setTitle("Coders - JavaFX PasswordField");
        primaryStage.setScene(scene);   
        primaryStage.show();  */
		
		// Switching entre deux scènes
		/*
		VBox layout = new VBox();
		VBox layout2 = new VBox();
		
		layout.setAlignment(Pos.CENTER);
		layout2.setAlignment(Pos.CENTER);
		
		
		Scene scene = new Scene(layout, 300, 300);
		Scene scene2 = new Scene(layout2, 300, 300);
		
		
		Label label1 = new Label("This is the First Scene");
		Label label2 = new Label("This is the Second Scene");
		
		
		Button button = new Button("Forward");
		button.setOnAction(e -> primaryStage.setScene(scene2));
		
		
		Button button2 = new Button("Backwards");
		button2.setOnAction(e -> primaryStage.setScene(scene));
		
		
		TextField text = new TextField();
		text.setMaxWidth(100);
		
		layout.getChildren().addAll(label1, button);
		layout2.getChildren().addAll(label2, button2, text);
		
		primaryStage.setTitle("Switching Between Scene");
		primaryStage.setScene(scene);
		primaryStage.show();
	    */   
		
		//DatePicker
		/*
		DatePicker datepick = new DatePicker(); 
        VBox layout = new VBox(datepick);
 
        Scene scene = new Scene(layout, 200, 250);  
 
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show(); */
		/*
		Label label = new Label("Ici la date");
		DatePicker datepick = new DatePicker();
		 
		datepick.setOnAction(e -> {
			
			if(e.getSource() == datepick) {
	            System.out.println("Vous avez choisi une date");
	            label.setText("Date: " + datepick.getValue());
	        }
		    
		});
		         
		VBox layout = new VBox(datepick, label);
		layout.setSpacing(40);
		layout.setAlignment(Pos.CENTER);
		 Scene scene = new Scene(layout, 200, 250);  
		 
	        primaryStage.setTitle("CodersLegacy");
	        primaryStage.setScene(scene);   
	        primaryStage.show(); 
	   */ 
		
		/*
		FileInputStream stream = new FileInputStream("C:\\Users\\amine\\Desktop\\Doc_Java_Fx\\logo.png");
		Image image = new Image(stream);
		ImageView imageview = new ImageView(image);
		         
		StackPane layout = new StackPane(imageview);
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setTitle("Java FX avec ISIKA");
        primaryStage.setScene(scene);   
        primaryStage.show(); */
		
		/*
		VBox layout = new VBox();
        Scene scene = new Scene(layout, 300, 300);  
         
        ComboBox combo = new ComboBox();
         combo.getItems().add("Option 1");
         combo.getItems().add("Option 2");
         combo.getItems().add("Option 3");
         combo.getItems().add("Option 4");
         combo.getItems().add("Option 5");
 
         
         Button button = new Button("Click me");
         button.setOnAction(e -> {
             System.out.println(combo.getValue());
         });
        layout.getChildren().addAll(combo,button);
     
        primaryStage.setTitle("CodersLegacy");
        primaryStage.setScene(scene);   
        primaryStage.show();*/
		
		
		// Exercice 2
		
		
		//Partie centrale du formulaire
		VBox vbox = new VBox();


		Label titreForm = new Label("Formulaire d'inscription");
		titreForm.setFont(new Font("Arial", 16));
		
		//Partie nom
		HBox hboxNom = new HBox();
		Label lNom = new Label("Nom : ");
		TextField textNom = new TextField();
		hboxNom.getChildren().addAll(lNom,textNom);
		hboxNom.setAlignment(Pos.CENTER);
		
		//Partie email
		HBox hboxEmail = new HBox();
		Label lEmail = new Label("Email : ");
		TextField textEmail = new TextField();
		hboxEmail.getChildren().addAll(lEmail,textEmail);
		hboxEmail.setAlignment(Pos.CENTER);
		
		//Partie Password
		HBox hboxPassword = new HBox();
		Label lPassword = new Label("Password : ");
		PasswordField passwordField = new PasswordField();
		hboxPassword.getChildren().addAll(lPassword,passwordField);
		hboxPassword.setAlignment(Pos.CENTER);
		
		//Partie Status
		HBox hboxStatus = new HBox();
		Label lStatus = new Label("Status : ");
		CheckBox pro = new CheckBox("Pro ");
	    CheckBox etudiant = new CheckBox("Etudiant ");
	        
	    hboxStatus.getChildren().addAll(lStatus,pro,etudiant);
	    hboxStatus.setAlignment(Pos.CENTER);
		
		
		
		//Mettre le tout dans vbox au centre
		vbox.getChildren().addAll(titreForm,hboxNom,hboxEmail,hboxPassword,hboxStatus);
		vbox.setSpacing(5);
		
		
		
		// Parties droite et gauche
        Label label3 = new Label(""); 
        Label label5 = new Label("");
        
        
        //Partie Favicon
        primaryStage.getIcons().add(new Image("C:\\Users\\amine\\Desktop\\Doc_Java_Fx\\logo.png"));
        
        // Partie Header(Logo)
		FileInputStream stream = new FileInputStream("C:\\Users\\amine\\Desktop\\Doc_Java_Fx\\logo.png");
		Image image = new Image(stream);
		ImageView imageview = new ImageView(image);
		
        //Partie Footer(Copyright)
        Label label4 = new Label("Copyright@ISKA 5-6-7 Avril 2022");
             
       
  
        
        //partie entête 
        
        //HBox hbox = new HBox();
        
        //hbox.getChildren().addAll(label1);
        
        BorderPane layout = new BorderPane(vbox, imageview, label3, label4, label5);
        layout.setPadding(new Insets(2, 2, 2, 2));  
        
        layout.setAlignment(label1, Pos.CENTER); 
        //layout.setAlignment(label2, Pos.CENTER); 
        layout.setAlignment(label3, Pos.CENTER); 
        layout.setAlignment(label4, Pos.CENTER); 
        layout.setAlignment(label5, Pos.CENTER); 
        
        Scene scene = new Scene(layout, 600, 400);  
        
        
        primaryStage.setTitle("ISIKA Lab Day 1");
        primaryStage.setScene(scene);   
        primaryStage.show();
        
      
    }
	
	@Override
	public void handle(ActionEvent event) {
        if(event.getSource() == button) {
            System.out.println("Vous avez cliquer sur le bouton");
        }
        if(event.getSource() == button2) {
            System.out.println("Un clic sur le deuxième bouton");
        }
             
    }
	
	public static void main(String[] args) {
		System.out.println(Jour.JEUDI);
		launch(args);
	}
}
