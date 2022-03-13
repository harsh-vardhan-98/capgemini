var strings= ["Hello", "World", "in", "a" ,"frame"];
var max = strings.sort(function(a,b){return b.length - a.length});
var s="*";
var a=[];
for(var i=0; i<max;i++){
     a.push(s);
}
s = a.join(" ");
console.log(s);
for(var i=0; i<strings.length;i++){
     console.log("* "+ strings[i] + " *");
}
console.log(s);
