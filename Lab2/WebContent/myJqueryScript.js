function f1()
{
    document.getElementById("myTitle").innerHTML= "Title is changed";
}

function f2()
{
    document.getElementById("div1").innerHTML= "div is changed";
}

function f3()
{
    var para = document.createElement("div1");
    var t = document.createTextNode("This is text added in div 1.");
    para.appendChild(t);
    document.getElementById("div1").appendChild(para);
}

function f4() {
    document.title= " This is new title " ;

}

function f5()
{

    var x = document.getElementById('div1');
    if (x.style.display === 'none') {
        x.style.display = 'block';
    } else {
        x.style.display = 'none';
    }
}
