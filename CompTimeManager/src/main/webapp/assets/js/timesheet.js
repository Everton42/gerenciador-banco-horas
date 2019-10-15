$('#WorkHourModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) 
  var action = button.data('action')
  var id = button.data('id')
  var inputDate = $('#tdDate-'+id)
  var inputStart = $('#tdStart-'+id)
  var inputEnd = $('#tdEnd-'+id)
  var modal = $(this)
  

  modal.find('.btn-salvar').val(action)	 
  modal.find('.modal-title').html("Adicionar apontamento")
  if(action == "AddWorkHour"){
  }else {
	  modal.find('input[name="date"]').val(inputDate.text())
	  modal.find('input[name="start"]').val(inputStart.text())
	  modal.find('input[name="end"]').val(inputEnd.text())
	  modal.find('input[name="id"]').val(id)
	  modal.find('.modal-title').html("Alterar apontamento")
  }
})