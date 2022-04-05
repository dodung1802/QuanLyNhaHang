package fpt.thanhluan.quanlynhahang.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import fpt.thanhluan.quanlynhahang.DAO.LoaiDoAnDAO;
import fpt.thanhluan.quanlynhahang.DAO.PhongDAO;
import fpt.thanhluan.quanlynhahang.DTO.LoaiDoAn;
import fpt.thanhluan.quanlynhahang.DTO.Phong;
import fpt.thanhluan.quanlynhahang.R;

public class LoaiDoAnAdapter extends BaseAdapter {

    ArrayList<LoaiDoAn> listLoaiDoAns;
    LoaiDoAnDAO loaiDoAnDAO;

    public LoaiDoAnAdapter(ArrayList<LoaiDoAn> listLoaiDoAns, LoaiDoAnDAO loaiDoAnDAO) {
        this.listLoaiDoAns = listLoaiDoAns;
        this.loaiDoAnDAO = loaiDoAnDAO;
    }

    @Override
    public int getCount() {
        return listLoaiDoAns.size();
    }

    @Override
    public Object getItem(int position) {

        LoaiDoAn objLoaiDoAn = listLoaiDoAns.get(position);
        return objLoaiDoAn;
    }

    @Override
    public long getItemId(int position) {
        LoaiDoAn objLoaiDoAn = listLoaiDoAns.get(position);
        return objLoaiDoAn.getMaLoaiDA();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View itemview;
        //khởi tạo cho item

        if (view == null) {
            itemview = View.inflate(viewGroup.getContext(), R.layout.item_lv_loaidoan, null);

        } else itemview = view;
        //lấy thôgn tin bản ghi dữ liệu
        final LoaiDoAn objLoaiDoAn = listLoaiDoAns.get(position);
        final int _index = position;

//ánh xạ các bviuến
        TextView tvMaLoaiDA = itemview.findViewById(R.id.tvMaLoaiDA);
        TextView tvTenLoaiDA = itemview.findViewById(R.id.tvTenLoaiDA);
        TextView tvXoa = itemview.findViewById(R.id.tvXoa);
        TextView tvSua = itemview.findViewById(R.id.tvSua);

        //set text
        tvMaLoaiDA.setText(objLoaiDoAn.getMaLoaiDA() + "");
        tvTenLoaiDA.setText(objLoaiDoAn.getTenLoaiDA() + "");




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


        return itemview;
    }
}
