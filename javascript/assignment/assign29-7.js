

document.getElementById('orderedlist').innerHTML=          //create table
`------ordered list--------
<ol type="A">
<li>Black</li>
<li>White</li>
<li>Grey</li>
<li>Blue</li>
<li>Yellow</li>
<li>Red</li>
</ol>

 <ol type="a">
<li>Car</li>
<li>Bike</li>
<li>Cycle</li>
<li>Truck</li>
<li>Auto</li>
</ol>

<ol >
        <li>Rose</li>
        <li>Lily</li>
        <li>Tulip</li>
        <li>Sunflower</li>
        <li>Orchid</li>
    </ol>
`


document.getElementById('unorderedlist').innerHTML=
`---------unordered list--------------
<ul type="square">
     <li>Samsung</li>
     <li>Lenovo</li>
     <li>Micromax</li>
     <li>Honor</li>
     </ul>

<ul type="disc">
        <li>Mango</li>
        <li>Banana</li>
        <li>Kiwi</li>
     <li>Watermelon</li>
    </ul>
    
    <ul type="circle">
        <li>North</li>
        <li>South</li>
        <li>East</li>
     <li>West</li>
    </ul>`


    document.getElementById('form').innerHTML=
    `
                          

    <form id="for">
        <div>
            <label for="name">Name</label>
            <input type="text" id="a">
        </div><br>
        <div>
            <label for="age">Age</label>
            <input type="number" id="b">
        </div><br>
        <div>
            <label for="address">Address</label>
            <input type="text" id="c">
        </div><br>
        <div>
            <label for="dob">Date of Birth</label>
            <input type="date" id="d">
        </div><br>
        <div>
            <label for="email">Email id</label>
            <input type="email" id="e">
        </div><br>
        <div>
            <label for="gender">Gender</label>
            <input type="radio" id="f">Male
            <input type="radio" >Female
            <input type="radio" >Other
        </div><br>
        <div>
            <input type="submit" id="g">
        </div>
        
    
    </form>


    `

    document.getElementById('table').innerHTML=
    `<table border="2">


    <thead >
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
            <th>Date of Birth</th>
            <th>Email</th>
            <th>Gender</th>

        
        </tr>
    </thead>
    <tbody>
        <tr >
            <td>Palak</td>
            <td >21</td>

            <td>MUMBAI</td>
            <td>19-01-1998</td>
            <td>palak9801@gmail.com</td>
            <td>Female</td>
        </tr>
        <tr>
            <td>Pushkar</td>
            <td>19</td>
            <td>MUMBAI</td>
            <td>08-10-1999</td>
            <td>pushshivalkar@gmail.com</td>
            <td>Male</td>
        </tr>

        <tr>
            <td>Bhakti</td>
            <td>21</td>
            <td>MUMBAI</td>
            <td>04-11-1997</td>
            <td>patelbhakti.7@gmail.com</td>
            <td>Female</td>
        </tr>
        <tr>
            <td>Pradnya</td>
            <td>21</td>
            <td>MUMBAI</td>
            <td>23-06-1997</td>
            <td>shinde.pradnya@gmail.com</td>
            <td>Female</td>
        </tr>

        <tr>
            <td>Billi</td>
            <td>21</td>
            <td>MUMBAI</td>
            <td>04-12-1997</td>
            <td>billi@gmail.com</td>
            <td>Female</td>
        </tr>
    </tbody>
</table>
    `




