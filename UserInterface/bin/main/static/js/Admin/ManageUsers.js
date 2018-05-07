$(document).ready(function(){

	function populateDataTable(data){
		var table = $('#userTable');
		
		table.DataTable({
			data:data.userList,
			columns: [
				{title: "Given Name",data:"givenName"},
				{title: "Surname",data:"surname"},
				{title: "Position",data:"userRole"}
			],
		});
	}
	
	$.ajax({
		url:'/Admin/GetUsersList',
		type:'GET',
		success: function(data){
			console.log(data);
			populateDataTable(data);
		},
		error: function(){
			
		}
	});
	
});