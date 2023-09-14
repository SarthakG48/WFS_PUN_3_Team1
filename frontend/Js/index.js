window.onload = function () { 
    var parser=new DOMParser();
   
    //Check the support for the File API support 
    if (window.File && window.FileReader && window.FileList && window.Blob) {
       var fileSelected = document.getElementById('txtfiletoread');
       fileSelected.addEventListener('change', function (e) { 
            //Set the extension for the file 
            var fileExtension = /xml.*/; 
            //Get the file object 
            var fileTobeRead = fileSelected.files[0];
           //Check of the extension match 
            if (fileTobeRead.type.match(fileExtension)) { 
                //Initialize the FileReader object to read the 2file 
                var fileReader = new FileReader(); 
                fileReader.onload = function (e) { 
                    var user=[];
                    let response="";
                    var prefix=parser.parseFromString(fileReader.result,"text/xml")
                    // console.log(parser.parseFromString(fileReader.result,"text/xml").getElementsByTagName("name"));
                   for(let i=0;i< prefix.getElementsByTagName("name").length;i++){
                    
                    var name=prefix.getElementsByTagName("name")[i].childNodes[0].nodeValue;
                    var email=prefix.getElementsByTagName("email")[i].childNodes[0].nodeValue;
                    var phone=prefix.getElementsByTagName("phone")[i].childNodes[0].nodeValue;
                    var role=prefix.getElementsByTagName("role")[i].childNodes[0].nodeValue;
                    // user.push(name);
                    // console.log(name);
                    response+="<tr><td>"+name+"</td>"+"<td>"+email+"</td>"+"<td>"+phone+"</td>"+"<td>"+role+"</td></tr>";
                     }
                    

                    document.getElementById('tablebody').innerHTML = response;
                } 
                fileReader.readAsText(fileTobeRead); 
            } 
            else { 
                alert("Please select xml file"); 
            }
    
       }, false);
   } 
    else { 
        alert("Files are not supported"); 
    } 
    }
   
    
    