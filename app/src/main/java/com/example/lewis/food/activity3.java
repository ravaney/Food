package com.example.lewis.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class activity3 extends AppCompatActivity {

    ImageView img;
    TextView txt1,txt2;

    private final ArrayList<String> imgURL = new ArrayList<>();
    private String[] randoitems = {"Beer Cheese Burger", "Lasagna", "Mac'n Cheese", "Jamaican Christmas Cake", "Irish Car Bomb", "Spiced Chai", "Long Island Iced Tea"};
    private String[] recipes;

    private void getrecipes(){
         recipes[0]=("Ingredients \n" +
                 "For the cheese sauce: \n" +
                 "2 tablespoons unsalted butter\n" +
                 "2 tablespoons all-purpose flour\n" +
                 "1/4 teaspoon mustard powder\n" +
                 "3/4 cup beer\n" +
                 "1/2 cup half-and-half\n" +
                 "6 ounces grated sharp yellow cheddar cheese\n" +
                 "1 tablespoon horseradish\n" +
                 "For the burgers: \n" +
                 "1 1/2 pounds ground beef, preferably chuck\n" +
                 "Kosher salt and freshly ground pepper\n" +
                 "Vegetable oil, for the grill\n" +
                 "4 poppy seed rolls, split\n" +
                 "Tomato slices, for topping\n" +
                 "2 tablespoons chopped fresh chives\n" +
                 "\n" +
                 "\n" +
                 "Directions \n" +
                 "Preheat a grill to medium high. Melt the butter in a medium saucepan over medium heat. Add the flour and mustard powder and cook, stirring, 3 minutes. Whisk in the beer and bring to a simmer; whisk in the half-and-half until smooth. Return the sauce to a simmer and cook, whisking occasionally, until thickened, 3 to 4 minutes. Stir in the cheese and horseradish until smooth; keep warm. \n" +
                 "Form the beef into four 6-ounce patties, about 3/4 inch thick; press the center of each patty with your thumb to make a 1/2-inch-deep indentation. Season the patties on both sides with salt and pepper. Lightly brush the grill grates with vegetable oil, then grill the patties, indentation-side up, until marked on the bottom, about 5 minutes. Flip and cook until marked and slightly firm, about 3 more minutes for medium doneness. Remove the patties to a plate and let rest 5 minutes. Grill the rolls, cut-side down, until lightly toasted, about 1 minute. \n" + "Top the bun bottoms with the burger patties, cheese sauce, tomato and chives. Cover with the bun tops. ");
         recipes[1] = ("Ingredients\n" +
                 "1 pound ground beef\n" +
                 "3/4 pound bulk pork sausage\n" +
                 "3 cans (8 ounces each) tomato sauce\n" +
                 "2 cans (6 ounces each) tomato paste\n" +
                 "2 garlic cloves, minced\n" +
                 "2 teaspoons sugar\n" +
                 "1 teaspoon Italian seasoning\n" +
                 "1/2 to 1 teaspoon salt\n" +
                 "1/4 to 1/2 teaspoon pepper\n" +
                 "3 large eggs\n" +
                 "3 tablespoons minced fresh parsley\n" +
                 "3 cups 4% small-curd cottage cheese\n" +
                 "1 carton (8 ounces) ricotta cheese\n" +
                 "1/2 cup grated Parmesan cheese\n" +
                 "9 lasagna noodles, cooked and drained\n" +
                 "6 slices provolone cheese (about 6 ounces) \n" +
                 "3 cups shredded part-skim mozzarella cheese, divided \n" +
                 "\n" +
                 "Directions\n" +
                 "In a large skillet over medium heat, cook and crumble beef and sausage until no longer pink; drain. Add next seven ingredients. Bring to a boil. Reduce heat; simmer, uncovered, 1 hour, stirring occasionally. Adjust seasoning with additional salt and pepper, if desired.\n" +
                 "Meanwhile, in a large bowl, lightly beat eggs. Add parsley; stir in cottage cheese, ricotta and Parmesan cheese.\n" +
                 "Preheat oven to 375°. Spread 1 cup meat sauce in an ungreased 13x9-in. baking dish. Layer with three noodles, provolone cheese, 2 cups cottage cheese mixture, 1 cup mozzarella, three noodles, 2 cups meat sauce, remaining cottage cheese mixture and 1 cup mozzarella. Top with remaining noodles, meat sauce and mozzarella (dish will be full).\n" +
                 "Cover; bake 50 minutes. Uncover; bake until heated through, 20 minutes. Let stand 15 minutes before cutting.\n" +
                 "Nutrition Facts\n" +
                 "1 piece: 503 calories, 27g fat (13g saturated fat), 136mg cholesterol, 1208mg sodium, 30g carbohydrate (9g sugars, 2g fiber), 36g protein. ");
         recipes[2] = ("Ingredients\n" +
                 "1-1/2 cups uncooked elbow macaroni\n" +
                 "5 tablespoons butter, divided\n" +
                 "3 tablespoons all-purpose flour\n" +
                 "1/2 teaspoon salt\n" +
                 "1/4 teaspoon pepper\n" +
                 "1-1/2 cups whole milk\n" +
                 "1 cup shredded cheddar cheese\n" +
                 "2 ounces process cheese (Velveeta), cubed\n" +
                 "2 tablespoons dry bread crumbs\n" +
                 "\n" +
                 "Directions\n" +
                 "Cook macaroni according to package directions. Meanwhile, in a saucepan, melt 4 tablespoons butter over medium heat. Stir in flour, salt and pepper until smooth. Gradually add milk. Bring to a boil; cook and stir for 2 minutes or until thickened. Reduce heat. Add the cheeses, stirring until cheese is melted. Drain macaroni.\n" +
                 "Transfer macaroni to a greased 1-1/2-qt. baking dish. Pour cheese sauce over macaroni; mix well. Melt the remaining butter; add the bread crumbs. Sprinkle over top. Bake, uncovered, at 375° for 30 minutes or until heated through and topping is golden brown.\n" +
                 "Nutrition Facts\n" +
                 "1 serving: 309 calories, 20g fat (13g saturated fat), 60mg cholesterol, 569mg sodium, 22g carbohydrate (4g sugars, 1g fiber), 11g protein. ");
         recipes[2] = ("INGREDIENTS :\n" +
                 "6 ounces or 1.5 cup flour\n" +
                 "8 ounces margarine or butter\n" +
                 "8 ounces sugar\n" +
                 "4 eggs\n" +
                 "1 pound raisins\n" +
                 "1 teaspoon cinnamon\n" +
                 "1/2 teaspoon mixed spice\n" +
                 "1/2 teaspoon salt\n" +
                 "4 ounces mixed peel\n" +
                 "4 ounces cherries\n" +
                 "1/2 pound prunes (chopped)\n" +
                 "1 cup wine/brandy\n" +
                 "1 teaspoon baking powder\n" +
                 "1 teaspoon vanilla\n" +
                 "finely grated rind of 1 lime/lemon\n" +
                 "2 tablespoons browning (or burnt brown sugar)\n" +
                 "\n" +
                 "Shop Now for Jamaican recipe ingredients & seasoning in our online store.\n" +
                 "METHOD:\n" +
                 "Cream butter, sugar and browning until soft and fluffy.\n" +
                 "Sieve all dry ingredients together\n" +
                 "Beat eggs, wine/brandy together.\n" +
                 "Add egg mixture to creamed butter and sugar.\n" +
                 "Add fruits.\n" +
                 "Add flour and fold in. Do no over-beat when mixing.\n" +
                 "Bake at 350F for 1 1/2 hours.\n" +
                 "Yield: 9′ round cake.");
         recipes[4] = ("Ingredients \n" +
                 "1/2 oz. Irish Cream (Bailey's)\n" +
                 "1/2 pint Stout (Guinness)\n" +
                 "1/2 oz. Whiskey, Irish (Jameson)\n" +
                 "Mixing Instructions \n" +
                 "Pour half a pint of chilled Guinness into a beer mug and let it settle. Take a shot glass filled with 1/2 oz. of Irish whiskey on the bottom and 1/2 oz. of Irish cream on top. Drop the shot glass into the Guinness and chug. ");
         recipes[5] = ("Ingredients\n" +
                 "3 cups nonfat dry milk powder\n" +
                 "1-1/2 cups sugar\n" +
                 "1 cup unsweetened instant tea\n" +
                 "3/4 cup vanilla powdered nondairy creamer\n" +
                 "1-1/2 teaspoons ground ginger\n" +
                 "1-1/2 teaspoons ground cinnamon\n" +
                 "1/2 teaspoon ground cardamom\n" +
                 "1/2 teaspoon ground cloves\n" +
                 "OPTIONAL GARNISH:\n" +
                 "Whipped cream\n" +
                 "\n" +
                 "Directions\n" +
                 "In a food processor, combine all dry ingredients; cover and process until powdery. Store in an airtight container in a cool, dry place for up to 6 months.\n" +
                 "To prepare 1 serving: Dissolve 3 tablespoons of mix in 3/4 cup of boiling water; stir well. Dollop with whipped cream if desired.\n" +
                 "Nutrition Facts\n" +
                 "3 tablespoons: 114 calories, 1g fat (1g saturated fat), 3mg cholesterol, 75mg sodium, 21g carbohydrate (19g sugars, 0 fiber), 5g protein. Diabetic Exchanges: 1-1/2 starch. ");
         recipes[6] = ("INGREDIENTS:\n" +
                 "0.5 oz Captain Morgan Original Spiced Rum\n" +
                 "0.25 oz vodka\n" +
                 "0.25 oz tequila\n" +
                 "0.25 oz gin\n" +
                 "0.25 oz triple sec\n" +
                 "2 oz sweet and sour mix\n" +
                 "2 oz cola \n" +
                 " \n" +
                 "HOW TO MAKE:\n" +
                 "1. Add Captain Morgan Original Spiced Rum, vodka, tequila, gin, triple sec, sour mix and cola into glass with ice and stir.\n" +
                 "2. Garnish with orange slice or lime. ");




    }

    private void getimagebitmaps(){
        imgURL.add("https://bit.ly/2DtN2Xs");
        imgURL.add("https://bit.ly/2AUjKis");
        imgURL.add("https://bit.ly/2JOmm3X");
        imgURL.add("https://bit.ly/1FwyTi1");
        imgURL.add("https://bit.ly/2SQTV9T");
        imgURL.add("https://bit.ly/2RDO5aq");
        imgURL.add("https://bit.ly/2SSgxGS");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);



        getrecipes();
        getimagebitmaps();
        randomise();


    }

    public void randomise(){
        int min = 0;
        int max = 7;
        int random = new Random().nextInt((max-min)+1)+min;
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        img = findViewById(R.id.img);

        txt1.setText(randoitems[random]);
        txt2.setText(recipes[random]);
        //img.setImageResource(imgURL.get(random));


    }
}
