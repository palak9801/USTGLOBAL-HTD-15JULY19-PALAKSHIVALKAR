import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-recipes',
  templateUrl: './recipes.component.html',
  styleUrls: ['./recipes.component.css']
})
export class RecipesComponent implements OnInit {

  recipesData: any='';
  recipess=[
    {
      brand:'Strawberry Quark',
      img: 'https://cdn.pixabay.com/photo/2018/02/05/19/12/strawberry-3132973__340.jpg',
      description:'Ingredients  Serves: 4 250g ripe fresh strawberries, washed, hulled and chopped 1/2 lemon, juiced 4 to 5 tablespoons caster sugar, depending on the sweetness of the strawberries 250g fat free quark single cream or double cream (optional)  Method  Prep:15min  ›  Extra time:1hr  ›  Ready in:1hr15min  Mix strawberries and lemon juice in a bowl and set to one side for 20 minutes. Add quark and sugar to taste and stir well. Chill for at least 1 hour before serving.'
      
    },
    {
     brand:'Mojito',
     img: 'https://cdn.pixabay.com/photo/2019/07/27/11/26/cocktail-4366561__340.jpg',
     description:'Ingredient-- Ice, 6 ounces light rum, 12 mint sprigs, or spearmint, 8 roughly broken apart, 6 tablespoons fresh lime juice, 4 tablespoons sugar, Club soda, 4 slices lime. Place ice in beverage shaker then add in the rum, 8 broken up mint sprigs, lime juice and sugar. Shake well and serve over ice in a high ball glass. Top off each glass with a splash of club soda. Garnish each with a slice of lime and a sprig of mint.'
   },
   {
     brand:'Tiramisu',
     img: 'https://cdn.pixabay.com/photo/2017/03/19/18/22/italian-food-2157246__340.jpg',
     description:'In a medium saucepan, whisk together egg yolks and sugar until well blended. Whisk in milk and cook over medium heat, stirring constantly, until mixture boils. Boil gently for 1 minute, remove from heat and allow to cool slightly. Cover tightly and chill in refrigerator 1 hour. In a medium bowl, beat cream with vanilla until stiff peaks form. Whisk mascarpone into yolk mixture until smooth. In a small bowl, combine coffee and rum. Split ladyfingers in half lengthwise and drizzle with coffee mixture. Arrange half of soaked ladyfingers in bottom of a 7x11 inch dish. Spread half of mascarpone mixture over ladyfingers, then half of whipped cream over that. Repeat layers and sprinkle with cocoa. Cover and refrigerate 4 to 6 hours, until set.'
   },
   {
     brand:'Cappuccino',
     img: 'https://cdn.pixabay.com/photo/2016/11/21/13/09/caffeine-1845314__340.jpg',
     description:'Ingredients 1 cup (250 mL) hot Milk 1 cup (250 mL) hot espresso or  strong coffee  2 tsp (10 mL) sugar  pinch of ground cinnamonGrated semi-sweet chocolate Preparation  Combine hot milk, hot coffee, sugar and cinnamon in a blender container. Cover and blend at high speed for 10 sec or until frothy. Pour into cups and sprinkle with chocolate. Serve immediately.'
   },
   {
     brand:'Pancakes',
     img: 'https://cdn.pixabay.com/photo/2017/05/07/08/56/pancakes-2291908__340.jpg',
     description:'Ingredients 1 1/2 cups all-purpose flour,  2 tablespoons sugar, 2 teaspoons baking powder, 1 teaspoon baking soda, 1/2 teaspoon salt, 1 cup milk or buttermilk, 2 large eggs, 1/4 cup melted butter Instructions. In a large mixing bowl, sift together flour, sugar baking powder, baking soda, and salt. Whisk in milk, eggs, and melted butter just until combined. Preheat a flat griddle over medium-high heat. Scoop 1/4 cup of pancake batter onto griddle. Let pancakes cook until bubbles form before flipping. Cook other side until golden brown. Serve hot with syrup.'
   },
   {
    brand:'Gulab Jamun',
    img: 'https://image.shutterstock.com/image-photo/indian-dessert-gulab-jamun-260nw-268218728.jpg',
    description:'RECIPE: firstly in a large mixing bowl take milk powder. further, to that add maida and rava then add pinch of baking soda  also add ghee, lemon juice and crumble well.slowly add milk little by little and knead well. knead to a smooth and soft dough. furthermore, make small balls greasing ghee to hands. make sure there are no cracks on balls. else there are chances for gulab jamun to break while frying. heat the ghee on low flame and when the ghee is moderately hot, fry the jamuns. fry the balls on low flame stirring in between. fry till the balls turns golden brown. immediately, drop the hot jamuns into hot sugar syrup. cover the lid and rest for 2 hours. flame should be turned off. finally, the jamuns have doubled in size.'
  },
  {
    brand:'Lemon Tea',
    img: 'https://cdn.pixabay.com/photo/2016/10/14/18/21/tee-1740871__340.jpg',
    description:'Ingredients 1 cup water2 teaspoons honey1 teaspoon fresh lemon juice1 teaspoon white sugar, or to taste. Directions Pour water into a mug. Add honey and heat in the microwave for 1 minute and 30 seconds. Stir in lemon juice, mixing until honey is dissolved, then stir in the sugar.'
  },
  {
    brand:'Sandwich',
    img: 'https://image.shutterstock.com/image-photo/tuna-sandwich-on-wooden-board-260nw-678222832.jpg',
    description:'1. Butter all the slices of bread. 2. Spread 1 to 2 tsp of mint chutney. 3. Arrange 3 to 4 cucumber and carrot slices on it. 4. Keep one more bread slice on top the cucumber and carrots. 5. Arrange sliced onions and tomatoes. 6. Add chopped green chillies, salt and pepper powder. 7. Sprinkle little coriander leaves on top and cover with one more slice of bread. 8. Press well and cut into squares. 9. Serve with tomato ketchup.'
  },
  {
    brand:'Tropical Berry Smoothies',
    img: 'https://www.tasteofhome.com/wp-content/uploads/0001/01/Tropical-Berry-Smoothies_EXPS_TOHCA19_73225_B03_15_4b_rms-696x696.jpg',
    description:'Ingredients  1 cup pina colada juice blend  1 container (6 ounces) vanilla yogurt 1/4 cup frozen mango chunks  1/4 cup frozen unsweetened blueberries  1/3 cup frozen unsweetened strawberries  Directions  In a blender, combine all the ingredients; cover and process for 30 seconds or until smooth. Pour into chilled glasses; serve immediately.'
  },
   {
     brand:'Peanutty Strawberry Banana Smoothies',
     img: 'https://www.tasteofhome.com/wp-content/uploads/2019/07/Fruity-Peanut-Butter-Smoothies_EXPS_FT19_87968_F_0710_1-696x696.jpg',
     description:'Ingredients  2 cups frozen unsweetened strawberries 1 cup fat-free milk  1 medium banana, cut into chunks   2 tablespoons creamy peanut butter  2 teaspoons vanilla extract  Fresh strawberries, optional  Directions In a blender, combine all ingredients; cover and process for 30 seconds or until smooth. Pour into chilled glasses; if desired, garnish with additional peanut butter and fresh strawberries.'
   }
  
   
  ]
constructor() { }
 
ngOnInit() {
}
sendRecipes(recipes){
 this.recipesData=recipes;
 console.log(recipes);
}
}
