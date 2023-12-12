public class pelanggan implements minimarket{
    public String nama;
    public String alamat;
    public pelanggan (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    @Override
    public void cetakFaktur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetakFaktur'");
    }

    @Override
    public Integer totalBayar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalBayar'");
    }

    @Override
    public void dataPelanggan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dataPelanggan'");
    }

    @Override
    public void totalBelanja() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalBelanja'");
    }
}