drawTable();

function drawTable() {
    var table = $('#orderTable').DataTable({
        "sAjaxSource": `/orders`,
        "sAjaxDataProp": "",
        "order": [[0, "desc"]],
        "scrollX": true,
        dom: 'Bfrtip',
        columnDefs: [
            {
                targets: [7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30],
                visible: false
            }],
        buttons: [
            {
                extend: 'excel',
                className: 'btn btn-danger',
                titleAttr: 'Экспорт телефонов в Excel',
                text: 'Экспорт телефонов в Excel',
                exportOptions: {
                    columns: [5],
                },
            },
            {
                text: 'All columns', action: function setColVisible() {

                    $('#orderTable').DataTable().column(7).visible(!$('#orderTable').DataTable().column(7).visible());
                    $('#orderTable').DataTable().column(8).visible(!$('#orderTable').DataTable().column(8).visible());
                    $('#orderTable').DataTable().column(9).visible(!$('#orderTable').DataTable().column(9).visible());
                    $('#orderTable').DataTable().column(10).visible(!$('#orderTable').DataTable().column(10).visible());
                    $('#orderTable').DataTable().column(11).visible(!$('#orderTable').DataTable().column(11).visible());
                    $('#orderTable').DataTable().column(12).visible(!$('#orderTable').DataTable().column(12).visible());
                    $('#orderTable').DataTable().column(13).visible(!$('#orderTable').DataTable().column(13).visible());
                    $('#orderTable').DataTable().column(14).visible(!$('#orderTable').DataTable().column(14).visible());
                    $('#orderTable').DataTable().column(15).visible(!$('#orderTable').DataTable().column(15).visible());
                    $('#orderTable').DataTable().column(16).visible(!$('#orderTable').DataTable().column(16).visible());
                    $('#orderTable').DataTable().column(17).visible(!$('#orderTable').DataTable().column(17).visible());
                    $('#orderTable').DataTable().column(18).visible(!$('#orderTable').DataTable().column(18).visible());
                    $('#orderTable').DataTable().column(19).visible(!$('#orderTable').DataTable().column(19).visible());
                    $('#orderTable').DataTable().column(20).visible(!$('#orderTable').DataTable().column(20).visible());
                    $('#orderTable').DataTable().column(21).visible(!$('#orderTable').DataTable().column(21).visible());
                    $('#orderTable').DataTable().column(22).visible(!$('#orderTable').DataTable().column(22).visible());
                    $('#orderTable').DataTable().column(23).visible(!$('#orderTable').DataTable().column(23).visible());
                    $('#orderTable').DataTable().column(24).visible(!$('#orderTable').DataTable().column(24).visible());
                    $('#orderTable').DataTable().column(25).visible(!$('#orderTable').DataTable().column(25).visible());
                    $('#orderTable').DataTable().column(26).visible(!$('#orderTable').DataTable().column(26).visible());
                    $('#orderTable').DataTable().column(27).visible(!$('#orderTable').DataTable().column(27).visible());
                    $('#orderTable').DataTable().column(28).visible(!$('#orderTable').DataTable().column(28).visible());
                    $('#orderTable').DataTable().column(29).visible(!$('#orderTable').DataTable().column(29).visible());
                    $('#orderTable').DataTable().column(30).visible(!$('#orderTable').DataTable().column(30).visible());

                }
            }
        ],
        "aoColumns": [
            {"mData": "orderDate"},
            {"mData": "lastName"},
            {"mData": "name"},
            {"mData": "patronymic"},
            {"mData": "birthday"},
            {"mData": "phone_number"},
            {"mData": "orders"},
            {"mData": "dal_od"},
            {"mData": "dal_cyl_od"},
            {"mData": "dal_ax_od"},
            {"mData": "dal_os"},
            {"mData": "dal_cyl_os"},
            {"mData": "dal_ax_os"},
            {"mData": "rasst_dal"},
            {"mData": "bliz_od"},
            {"mData": "bliz_cyl_od"},
            {"mData": "bliz_ax_od"},
            {"mData": "bliz_os"},
            {"mData": "bliz_cyl_os"},
            {"mData": "bliz_ax_os"},
            {"mData": "rasst_bliz"},
            {"mData": "srednee_od"},
            {"mData": "srednee_cyl_od"},
            {"mData": "srednee_ax_od"},
            {"mData": "srednee_os"},
            {"mData": "srednee_cyl_os"},
            {"mData": "srednee_ax_os"},
            {"mData": "rasst_srednee"},
            {"mData": "comment"},
            {"mData": "id", fnCreatedCell: function (nTd, sData, oData, iRow, iCol) {
                    $(nTd).html("<a href='/delete/" + oData.id + "'><img src='img/del.png' width='20px' height='20px'></a>");
                }
            },
            {"mData": "id", fnCreatedCell: function (nTd, sData, oData, iRow, iCol) {
                    // $(nTd).html("<a href='/edit/" + oData.id + "'><img src='img/edit.png' width='20px' height='20px'></a>");
                    $(nTd).html("<a href='/#edit/'><img src='img/edit.png' width='20px' height='20px'></a>");

                }
            }

        ],

    });

    $('#orderTable tbody').on('click', 'tr', function () {
        var row = table.row(this).data();
        $("#orderDate1").val(row['orderDate']);
        $("#orderid").val(row['id']);
        $("#lastName1").val(row['lastName']);
        $("#name1").val(row['name']);
        $("#patronymic1").val(row['patronymic']);
        $("#phone_number1").val(row['phone_number']);
        $("#birthday1").val(row['birthday']);
        $("#orders1").val(row['orders']);
        $(".dal_od span").text(row['dal_od']);
        $(".dal_cyl_od span").text(row['dal_cyl_od']);
        $(".dal_ax_od span").text(row['dal_ax_od']);
        $(".dal_os span").text(row['dal_os']);
        $(".dal_cyl_os span").text(row['dal_cyl_os']);
        $(".dal_ax_os span").text(row['dal_ax_os']);
        $(".rasst_dal span").text(row['rasst_dal']);
        $(".bliz_od span").text(row['bliz_od']);
        $(".bliz_cyl_od span").text(row['bliz_cyl_od']);
        $(".bliz_ax_od span").text(row['bliz_ax_od']);
        $(".bliz_os span").text(row['bliz_os']);
        $(".bliz_cyl_os span").text(row['bliz_cyl_os']);
        $(".bliz_ax_os span").text(row['bliz_ax_os']);
        $(".rasst_bliz span").text(row['rasst_bliz']);
        $(".srednee_od span").text(row['srednee_od']);
        $(".srednee_cyl_od span").text(row['srednee_cyl_od']);
        $(".srednee_ax_od span").text(row['srednee_ax_od']);
        $(".srednee_os span").text(row['srednee_os']);
        $(".srednee_cyl_os span").text(row['srednee_cyl_os']);
        $(".srednee_ax_os span").text(row['srednee_ax_os']);
        $(".rasst_srednee span").text(row['rasst_srednee']);
        $(".comment span").text(row['comment']);

        $("#myModal").modal("show");
    });
}

function addOrder() {
    var xhr = new XMLHttpRequest();
    // var body = "orderDate=" + document.getElementById("inputDateOrder").value
    //     + "&lastName=" + document.getElementById("inputLastName").value
    //     + "&name=" + document.getElementById("inputName").value
    //     + "&patronymic=" + document.getElementById("inputPatronymic").value
    //     + "&birthday=" + document.getElementById("inputBirthday").value
    //     + "&phone_number=" + document.getElementById("inputPhone").value
    //     + "&orders=" + document.getElementById("inputOrder").value
    //     + "&srednee_od=" + document.getElementById("inputSredneeOd").value
    //     + "&srednee_cyl_od=" + document.getElementById("inputSredneeCylOd").value
    //     + "&srednee_ax_od=" + document.getElementById("inputSredneeAxOd").value
    //     + "&srednee_os=" + document.getElementById("inputSredneeOs").value
    //     + "&srednee_cyl_os=" + document.getElementById("inputSredneeCylOs").value
    //     + "&srednee_ax_os=" + document.getElementById("inputSredneeAxOs").value
    //     + "&rasst_srednee=" + document.getElementById("inputSredneeRas").value
    //     + "&comment=" + document.getElementById("textareaComment").value
    //     + "&dal_od=" + document.getElementById("inputDalOd").value
    //     + "&dal_cyl_od=" + document.getElementById("inputDalCylOd").value
    //     + "&dal_ax_od=" + document.getElementById("inputDalAxOd").value
    //     + "&dal_os=" + document.getElementById("inputDalOs").value
    //     + "&dal_cyl_os=" + document.getElementById("inputDalCylOs").value
    //     + "&dal_ax_os=" + document.getElementById("inputDalAxOs").value
    //     + "&rasst_dal=" + document.getElementById("inputRc").value
    //     + "&bliz_od=" + document.getElementById("inputBlizOd").value
    //     + "&bliz_cyl_od=" + document.getElementById("inputBlizCylOd").value
    //     + "&bliz_ax_od=" + document.getElementById("inputBlizAxOd").value
    //     + "&bliz_os=" + document.getElementById("inputBlizOs").value
    //     + "&bliz_cyl_os=" + document.getElementById("inputBlizCylOs").value
    //     + "&bliz_ax_os=" + document.getElementById("inputBlizAxOs").value
    //     + "&rasst_bliz=" + document.getElementById("inputRcBliz").value;
    //
    // xhr.open("POST", '/add', true);
    // xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    // xhr.send(body);

    xhr.open('GET', "add_order?" +
        "orderDate=" + document.getElementById("inputDateOrder").value
        + "&lastName=" + document.getElementById("inputLastName").value
        + "&name=" + document.getElementById("inputName").value
        + "&patronymic=" + document.getElementById("inputPatronymic").value
        + "&birthday=" + document.getElementById("inputBirthday").value
        + "&phone_number=" + document.getElementById("inputPhone").value
        + "&orders=" + document.getElementById("inputOrder").value
        + "&srednee_od=" + document.getElementById("inputSredneeOd").value
        + "&srednee_cyl_od=" + document.getElementById("inputSredneeCylOd").value
        + "&srednee_ax_od=" + document.getElementById("inputSredneeAxOd").value
        + "&srednee_os=" + document.getElementById("inputSredneeOs").value
        + "&srednee_cyl_os=" + document.getElementById("inputSredneeCylOs").value
        + "&srednee_ax_os=" + document.getElementById("inputSredneeAxOs").value
        + "&rasst_srednee=" + document.getElementById("inputSredneeRas").value
        + "&comment=" + document.getElementById("textareaComment").value
        + "&dal_od=" + document.getElementById("inputDalOd").value
        + "&dal_cyl_od=" + document.getElementById("inputDalCylOd").value
        + "&dal_ax_od=" + document.getElementById("inputDalAxOd").value
        + "&dal_os=" + document.getElementById("inputDalOs").value
        + "&dal_cyl_os=" + document.getElementById("inputDalCylOs").value
        + "&dal_ax_os=" + document.getElementById("inputDalAxOs").value
        + "&rasst_dal=" + document.getElementById("inputRc").value
        + "&bliz_od=" + document.getElementById("inputBlizOd").value
        + "&bliz_cyl_od=" + document.getElementById("inputBlizCylOd").value
        + "&bliz_ax_od=" + document.getElementById("inputBlizAxOd").value
        + "&bliz_os=" + document.getElementById("inputBlizOs").value
        + "&bliz_cyl_os=" + document.getElementById("inputBlizCylOs").value
        + "&bliz_ax_os=" + document.getElementById("inputBlizAxOs").value
        + "&rasst_bliz=" + document.getElementById("inputRcBliz").value, false);
    xhr.send();
    $('#exampleModal').modal('hide');
    window.location.reload();
}