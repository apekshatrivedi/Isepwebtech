function validateMyForm()
{

// get all the inputs within the submitted form
    var inputs = document.getElementsByTagName('input');
    var test="";
    for (var i = 0; i < inputs.length; i++) {
        // only validate the inputs that have the required attribute
            if(inputs[i].value == ""){
                // found an empty field that is required
                test=test+inputs[i].name;
             }
        }
    var First = document.forms["myForm"]["fName"].value;
     var Last = document.forms["myForm"]["lName"].value;
      var Birth = document.forms["myForm"]["bDay"].value;
       var Sex = document.forms["myForm"]["sex"].value;

if(First==""|| Last==""||Birth==""||Sex=="")
{
 alert("Please fill all required fields,  Missing fields are :  "+test);
}
   else
   {
     alert("First: "+First+"  Last: "+Last+"  Birth: "+Birth+"  Sex: "+Sex);
   }
}

function toggleFM(n)
{

if (n==1){

  document.getElementById("myH1").innerHTML= "Hello Sir";
  document.getElementById("myH1").style.color= "red";
  document.getElementById("fs1").style.color= "red";
  document.getElementById("fs1").style.borderColor= "red";
  document.getElementById("fs2").style.color= "red";
  document.getElementById("fs2").style.borderColor= "red";
  document.getElementById("fs3").style.color= "red";
  document.getElementById("fs3").style.borderColor= "red";
  document.getElementById("fName").style.borderColor="red"
  document.getElementById("lName").style.borderColor="red"
  document.getElementById("date").style.borderColor="red"
   document.getElementById("fName").style.backgroundColor="#FFF3F3"
  document.getElementById("lName").style.backgroundColor="#FFF3F3"
  document.getElementById("date").style.backgroundColor="#FFF3F3"

  document.getElementById("fn").style.color="red"
  document.getElementById("ln").style.color="red"
  document.getElementById("bd").style.color="red"
  document.getElementById("sm").style.color="red"
    document.getElementById("sf").style.color="red"

     document.getElementById("submit").style.color="red"
     document.getElementById("submit").style.borderColor="red"
     document.getElementById("submit").style.backgroundColor="#FFF3F3"


}
else
{
  document.getElementById("fs1").style.color= "blue";
  document.getElementById("fs1").style.borderColor= "blue";
  document.getElementById("fs2").style.color= "blue";
  document.getElementById("fs2").style.borderColor= "blue";
  document.getElementById("fs3").style.color= "blue";
  document.getElementById("fs3").style.borderColor= "blue";
  document.getElementById("myH1").innerHTML= "Hello Madam";
  document.getElementById("myH1").style.color= "blue";
  document.getElementById("fName").style.borderColor="blue"
  document.getElementById("lName").style.borderColor="blue"
  document.getElementById("date").style.borderColor="blue"
   document.getElementById("fName").style.backgroundColor="#F0F8FF"
  document.getElementById("lName").style.backgroundColor="#F0F8FF"
  document.getElementById("date").style.backgroundColor="#F0F8FF"

   document.getElementById("fn").style.color="blue"
  document.getElementById("ln").style.color="blue"
  document.getElementById("bd").style.color="blue"
   document.getElementById("sm").style.color="blue"
    document.getElementById("sf").style.color="blue"

     document.getElementById("submit").style.color="blue"
     document.getElementById("submit").style.backgroundColor="#F0F8FF"
     document.getElementById("submit").style.borderColor="blue"



}
}