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
            <td>Jenny</td>
            <td>21</td>
            <td>MUMBAI</td>
            <td>24-10-1997</td>
            <td>jenny@gmail.com</td>
            <td>Female</td>
        </tr>
    </tbody>
</table>
    `



    let table=document.createElement('table');

    let tr1=document.createElement('tr');
    table.appendChild(tr1);

    let trd1=document.createElement('td');
    trd1.textContent='Name';
    tr1.appendChild(trd1);

    let trd2=document.createElement('td');
    trd2.textContent='Age';
    tr1.appendChild(trd2);
    ////////

    let tr2=document.createElement('tr');
    table.appendChild(tr2);

    let tr2d1=document.createElement('td');
    tr2d1.textContent='palak';
    tr2.appendChild(tr2d1);
    let tr2d2=document.createElement('td');
    tr2d2.textContent=21;
    tr2.appendChild(tr2d2);
    //////////////

    let tr3=document.createElement('tr');
    table.appendChild(tr3);

    let tr3d1=document.createElement('td');
    tr3d1.textContent='pushkar';
    tr3.appendChild(tr3d1);
    let tr3d2=document.createElement('td');
    tr3d2.textContent=19;
    tr3.appendChild(tr3d2);
    /////////


    let tr4=document.createElement('tr');
    table.appendChild(tr4);

    let tr4d1=document.createElement('td');
    tr4d1.textContent='bhakti';
    tr4.appendChild(tr4d1);
    let tr4d2=document.createElement('td');
    tr4d2.textContent=21;
    tr4.appendChild(tr4d2);


    tr1.style.border="1px solid black";
    trd1.style.border="1px solid black";
    trd2.style.border="1px solid black";

    tr2.style.border="1px solid black";
    tr2d1.style.border="1px solid black";
    tr2d2.style.border="1px solid black";

    tr3.style.border="1px solid black";
    tr3d1.style.border="1px solid black";
    tr3d2.style.border="1px solid black";

    tr4.style.border="1px solid black";
    tr4d1.style.border="1px solid black";
    tr4d2.style.border="1px solid black";


    console.log(table);
    document.body.appendChild(table);