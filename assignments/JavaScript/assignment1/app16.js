var row  = prompt("enter rows ");
var colo = prompt("enter coloumb");


var table = document.createElement("table");
var data = table.insertRow(-1)
for(var i = 0; i<colo;i++){
     var cell = document.createElement("td");
     cell.innerHTML = `<p>colo</p>`;
     cell.setAttribute("id" , "row_"+`i`);
     data.appendChild(cell);

}

for(var i =0;i<row;i++){
    data = table.insertRow(-1);
    for(var j = 0; j<colo;j++){
         var cell = data.insertCell(-1);
         cell.innerHTML = "<p>row</p>";
         cell.setAttribute("id" , "row_"+"${i}");
    }
}

var dvTable = document.getElementById("dvTable");
dvTable.innerHTML = "";
dvTable.appendChild(table);
