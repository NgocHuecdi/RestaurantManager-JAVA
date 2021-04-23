function deleteEmployee(employeeId) {
    if (confirm("Are you sure delete this row?") == true){
         fetch(`/RestaurantJava/api/employees/${employeeId}`, {
            method: "delete",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function(res) {
            if (res.status == 200) {
                let d = document.getElementById(`employee${employeeId}`);
                d.style.display = "none";
            } else {
                alert("Something wrong!!!");
            }
        })
    }
}
//function loadEmp(){
// fetch("/RestaurantJava/api/searchEmp").then(function(res) {
//        return res.json();
//    }).then(function(data) {
//        console.log(data);
//        let d = document.getElementById("empId");
//        let msg = "";
//        data.forEach(function(v) {
//            let h = `
//            <tr>
//                <td>${v["empId"]}</td>
//                <td>${v["name"]}</td>
//                <td>${v["mail"]}</td>
//                <td>${v["address"]}</td>
//                <td>${v["birth"]}</td>
//            </tr>
//            `
//            msg += h;
//        });
//        
//        d.innerHTML = msg;
//    });
//}

