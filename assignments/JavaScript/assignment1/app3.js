function parity(num){
     if(num%2 == 0){
          return "even";
     }else{
          return "odd";
     }
}

var num = prompt("enter number");
console.log(parity(num));