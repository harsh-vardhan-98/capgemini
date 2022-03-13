var num = prompt("Enter your number");
var sum = 0;
for(var i = 0;i<=num;i++){
     if(num%3 == 0 || num%5 == 0){
          sum+=num;
     }else{
          continue;
     }
}
console.log(sum);
