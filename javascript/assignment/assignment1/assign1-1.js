console.log('=======object with new keyword=================');
console.log('          ');

var vehicle=new Object();
        vehicle.type='CAR';
        vehicle.name='Toyota';
        vehicle.color='Black';
        vehicle.model='MR2';
        function getData(){                           //name function
        console.log('Vehicle Type--'+vehicle.type);
        console.log('Vehicle Name--'+vehicle.name);
        console.log('Vehicle Color--'+vehicle.color);
        console.log('Vehicle Model--'+vehicle.model);
         }
        getData();

        console.log('               ');
        
      

    var books=new Object();
        books.genre='Mystry';
        books.name='The Women in White';
        books.author='Wilkie Collins';
        books.published='26 November';
        var getBook= function(){                        // function expression
        console.log('Book Genre--'+books.genre);
        console.log('Book Name--'+books.name);
        console.log('Book Author--'+books.author);
        console.log('Book Published on --'+books.published);
        }
        getBook();

        console.log('               ');


    var restaurant=new Object();
        restaurant.area='Mumbai';
        restaurant.name='Taj Hotels';
        restaurant.rating='5-star';
        restaurant.noofrooms=550;
        (function(){
        console.log('Restaurant Name--'+restaurant.name);
        console.log('Restaurant Area--'+restaurant.area);
        console.log('Restaurant Rating--'+restaurant.rating);
        console.log('Restaurant Number of Rooms--'+restaurant.noofrooms);
        }())

        console.log('               ');


        var bag=new Object();
            bag.brand="Wildcraft";
            bag.color="black";
            bag.noofchain=3;
            bag.size="20 inches";
            var getBag=function(){
            console.log('Bag Brand--'+bag.brand);
            console.log('Bag Color--'+bag.color);
            console.log('Bag No. of chains--'+bag.noofchain);
            console.log('Bag Size--'+bag.size);
            }
            getBag();
            console.log('               ');


        var cloth=new Object();
            cloth.type="shirt";
            cloth.color="blue";
            cloth.material="cotton";
            cloth.prize=1000;
            var getCloth=function(){
            console.log('Cloth Type--'+cloth.type);
            console.log('Cloth Color--'+cloth.color);
            console.log('Cloth Material--'+cloth.material);
            console.log('Cloth Prize(in rs.)--'+cloth.prize);
            }
            getCloth();