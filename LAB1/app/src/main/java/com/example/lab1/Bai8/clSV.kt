package com.example.lab1.Bai8

import java.time.LocalDate

class SinhVien(val hoTen: String, val tuoi: Int, val lop: String) {
    override fun toString(): String {
        return "Họ và tên: $hoTen, Tuổi: $tuoi, Lớp: $lop"
    }
}

// Yêu cầu 2: Xây dựng lớp TheMuon để quản lý việc mượn trả sách của các sinh viên.
class TheMuon(val maPhieuMuon: String, val ngayMuon: LocalDate, val hanTra: LocalDate, val soHieuSach: String, val sinhVien: SinhVien) {
    override fun toString(): String {
        return "Mã phiếu mượn: $maPhieuMuon, Ngày mượn: $ngayMuon, Hạn trả: $hanTra, Số hiệu sách: $soHieuSach, Thông tin sinh viên: $sinhVien"
    }
}

// Yêu cầu 3: Xây dựng các phương thức: Thêm, xoá theo mã phiếu mượn và hiển thị thông tin các thẻ mượn.
class QuanLyTheMuon {
    private val danhSachTheMuon = mutableListOf<TheMuon>()

    fun themTheMuon(theMuon: TheMuon) {
        danhSachTheMuon.add(theMuon)
    }

    fun xoaTheMuon(maPhieuMuon: String) {
        val theMuon = danhSachTheMuon.find { it.maPhieuMuon == maPhieuMuon }
        if (theMuon != null) {
            danhSachTheMuon.remove(theMuon)
            println("Đã xoá phiếu mượn có mã số $maPhieuMuon.")
        } else {
            println("Không tìm thấy phiếu mượn có mã số $maPhieuMuon để xoá.")
        }
    }

    fun hienThiDanhSachTheMuon() {
        danhSachTheMuon.forEach { println(it) }
    }
}