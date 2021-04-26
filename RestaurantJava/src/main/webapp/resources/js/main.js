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
function loadStatsBill(){
 fetch("/RestaurantJava/api/statsRe").then(function(res) {
          return res.json();
    }).then(function(data) {
        console.log(data);
        let d = document.getElementById("billId");
        let msg = "";
        data.forEach(function(v) {
            let datePay = new Date(v[5]);
            
            let h = `
            <tr>
                <td>${v[0]}</td>
                <td>${v[1]}</td>
             <td>${v[2]}</td>
             <td>${v[3]}</td>
             <td>${v[4]}</td>
                <td>${datePay.getFullYear()}-${datePay.getMonth()}-${datePay.getDay()}</td>
                <td>${v[6]}</td>
            </tr>
            `
            msg += h;
        });
        
        d.innerHTML = msg;
    });
}

