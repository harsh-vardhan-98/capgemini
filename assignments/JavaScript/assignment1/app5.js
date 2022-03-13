var amount = prompt("Enter the amount");
var currency = prompt("Enter the currency");
 
function convert(amount , currency){
     
     if(currency === "INR"){
          return amount*74.28;
     }else if(currency === "Yen"){
          return amount*109.14;
     }else if(currency === "Euro"){
          return amount*0.84;
     }else if(currency === "Pound"){
          return amount*0.72;
     }
}

money = convert(amount,currency);
alert(money);