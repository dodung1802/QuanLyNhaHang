package fpt.thanhluan.quanlynhahang.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import fpt.thanhluan.quanlynhahang.DAO.DoAnDAO;
import fpt.thanhluan.quanlynhahang.DAO.LoaiDoAnDAO;
import fpt.thanhluan.quanlynhahang.DTO.DoAn;
import fpt.thanhluan.quanlynhahang.DTO.LoaiDoAn;
import fpt.thanhluan.quanlynhahang.R;

public class DoAnAdapter extends BaseAdapter {

    ArrayList<DoAn> listDoAns;
    DoAnDAO doAnDAO;

    public DoAnAdapter(ArrayList<DoAn> listDoAns, DoAnDAO doAnDAO) {
        this.listDoAns = listDoAns;
        this.doAnDAO = doAnDAO;
    }

    @Override
    public int getCount() {
        return listDoAns.size();
    }

    @Override
    public Object getItem(int position) {
        DoAn objDoAn = listDoAns.get(position);
        return objDoAn;


    }

    @Override
    public long getItemId(int position) {
        DoAn objDoAn = listDoAns.get(position);
        return objDoAn.getMaDA();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View itemview;
        //khởi tạo cho item

        if (view == null) {
            itemview = View.inflate(viewGroup.getContext(), R.layout.item_lv_doan, null);

        } else itemview = view;
        //lấy thôgn tin bản ghi dữ liệu
        final DoAn objDoAn = listDoAns.get(position);
        final int _index = position;

//ánh xạ các bviuến
        TextView tvMaDoAn = itemview.findViewById(R.id.tvMaDoAn);
        TextView tvTenDoAn = itemview.findViewById(R.id.tvTenDoAn);
        TextView tvGiaDoAn = itemview.findViewById(R.id.tvGiaDoAn);
        TextView tvSoLuong = itemview.findViewById(R.id.tvSoLuong);

        TextView tvXoa = itemview.findViewById(R.id.tvXoa);
        TextView tvSua = itemview.findViewById(R.id.tvSua);


        //set text
        tvMaDoAn.setText(objDoAn.getMaDA() + "");
        tvTenDoAn.setText(objDoAn.getTenDA() + "");
        tvGiaDoAn.setText(objDoAn.getGiaDA() + "");
        tvSoLuong.setText(objDoAn.getSoLuongDA() + "");


        tvXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        tvSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return null;
    }
}
