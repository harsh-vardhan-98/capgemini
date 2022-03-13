var table = document.querySelector("#tbl");
var topping = [];




function display() {
     var delivery_option = "";
     var username = document.getElementById("name").value;
     var userMail = document.getElementById("email").value;
     var address = document.querySelector("#address").value;
     var check_topping = document.querySelectorAll(".checkbox");
     var check_delivery = document.querySelectorAll(".delivery-check");
     var price = 0;

     
     for(var i =0; i<check_topping.length; i++){
          if(check_topping[i].checked){
               topping.push(check_topping[i].parentNode.textContent);
          }
     };  
     check_delivery.forEach(element => {
          if(element.checked){
               delivery_option = element;
          }          
     });

     price = (10 + 1.5*topping.length + 5);

     var tr = document.createElement("tr");
     var td1 = tr.appendChild(document.createElement("td"));
     var td2 = tr.appendChild(document.createElement("td"));
     var td3 = tr.appendChild(document.createElement("td"));
     var td4 = tr.appendChild(document.createElement("td"));
     var td5 = tr.appendChild(document.createElement("td"));
     var td6 = tr.appendChild(document.createElement("td"));
     
     td1.innerHTML = username; 
     td2.innerHTML = userMail; 
     td3.innerHTML = topping;
     td4.innerHTML= delivery_option.value;
     td5.innerHTML = address;
     td6.innerHTML = price;

     table.appendChild(tr);
     
   

}