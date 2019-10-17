console.log('=======object without new keyword=================');
console.log('           ');

            var vehicle;
            vehicle={
              type:'CAR',
             name:'Toyota',
             color:'Black',
             model:'MR2',
              getType:function()
             {
                 return this.type;
                 return this.name;
                 return this.color;
                 return this.model;
             }
             };
            var type=vehicle.getType();
            console.log('Vehicle Type--'+type);
            var name=vehicle.getType();
            console.log('Vehicle Name--'+vehicle.name);
            var color=vehicle.getType();
            console.log('Vehicle Color--'+vehicle.color);
            var model=vehicle.getType();
            console.log('Vehicle Model--'+vehicle.model);


            console.log('               ');


            var books;
            books={
        genre:'Mystry',
        name:'The Women in White',
        author:'Wilkie Collins',
        published:'26 November',
        getBook:function()
        {     
            return this.genre;
            return this.name;
            return this.author;
            return this.published;  
                         }
                                         };   
       var genre=books.getBook();                                              // function expression
        console.log('Book Genre--'+books.genre);
        var type=vehicle.getType();
        console.log('Book Name--'+books.name);
        var type=vehicle.getType();
        console.log('Book Author--'+books.author);
        var type=vehicle.getType();
        console.log('Book Published on --'+books.published);


        console.log('               ');



        var restaurant;
        restaurant={
        area:'Mumbai',
        name:'Taj Hotels',
        rating:'5-star',
        noofrooms:550,
        getRestaurant:function(){
            return this.area;
            return this.name;
            return this.rating;
            return this.noofrooms;
        }};
        var area=restaurant.getRestaurant();  
        console.log('Restaurant Area--'+restaurant.area);
        var name=restaurant.getRestaurant();  
        console.log('Restaurant Name--'+restaurant.name);
        var rating=restaurant.getRestaurant();  
        console.log('Restaurant Rating--'+restaurant.rating);
        var noofrooms=restaurant.getRestaurant();  
        console.log('Restaurant Number of Rooms--'+restaurant.noofrooms);
        
        console.log('               ');
            
        var bag;
        bag={
            brand:"Wildcraft",
            color:"black",
            noofchain:3,
            size:"20 inches",
             getBag:function(){
                return this.brand;
            return this.color;
            return this.noofchain;
            return this.size;
             }};
             var brand=bag.getBag();
            console.log('Bag Brand--'+bag.brand);
            var color=bag.getBag();
            console.log('Bag Color--'+bag.color);
            var noofchain=bag.getBag();
            console.log('Bag No. of chains--'+bag.noofchain);
            var size=bag.getBag();
            console.log('Bag Size--'+bag.size);
            
            
            console.log('               ');


            var cloth;
            cloth={
            type:"shirt",
            color:"blue",
            material:"cotton",
            prize:1000,
             getCloth:function(){
                return this.type;
            return this.color;
            return this.material;
            return this.prize;
             }};

             var type=cloth.getCloth();
            console.log('Cloth Type--'+cloth.type);
            var color=cloth.getCloth();
            console.log('Cloth Color--'+cloth.color);
            var material=cloth.getCloth();
            console.log('Cloth Material--'+cloth.material);
            var prize=cloth.getCloth();
            console.log('Cloth Prize(in rs.)--'+cloth.prize);
            