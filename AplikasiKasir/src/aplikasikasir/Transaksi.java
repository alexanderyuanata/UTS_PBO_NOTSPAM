package aplikasikasir;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class Transaksi {
    public class Item {
        private Barang barang = new Barang();
        private int amount = 0;
        
        public Item(Barang to_insert, int count){
            this.barang = to_insert;
            this.amount = count;
        }        
        
        //get
        public Barang getBarang(){
            return this.barang;
        }
        
        public int getAmount(){
            return this.amount;
        }
        
        //set
        public void setItem(Barang to_insert, int count){
            this.barang = to_insert;
            this.amount = count;
        }      
    }
    
    private ArrayList<Item> barangdalam_transaksi = new ArrayList<>();
    private float total_belanja;
    private float jumlah_dibayar;
    private float kembalian;
    private LocalDateTime time;
    
    //constructor
    public Transaksi(float harga_belanjaan, float dibayar, float kembalian){
        this.total_belanja = harga_belanjaan;
        this.jumlah_dibayar = dibayar;
        this.kembalian = kembalian;
        this.time = LocalDateTime.now();
    }
    
    //methods
    public void displayTransaksi(){
        for (Item barang : barangdalam_transaksi) {
            System.out.println("Barang: " + barang.getBarang().getNama() + " berjumlah " + barang.getAmount());
        }
    }
    
    //get
    public Item getItem(int index){
        return barangdalam_transaksi.get(index);
    }
    
    public Barang getBarangAt(int index){
        return barangdalam_transaksi.get(index).getBarang();
    }
    
    public int getAmountAt(int index){
        return barangdalam_transaksi.get(index).getAmount();
    }
    
    public float getTotalBelanja(){
        return total_belanja;
    }
    
    public float getJumlahDibayar(){
        return jumlah_dibayar;
    }
    
    public float getKembalian(){
        return kembalian;
    }
    
    public LocalDateTime getTime(){
        return time;
    }
    
    //set
    public void addItem(Barang to_add, int count){
        this.barangdalam_transaksi.add(new Item(to_add, count));
    }
    
    public void changeItem(Barang to_change, int count, int index){
        this.barangdalam_transaksi.set(index, new Item(to_change, count));
    }
    
    public void changeItem(Item to_change, int index){
        this.barangdalam_transaksi.set(index, to_change);
    }
    
    public void changeMeta(float total_belanja){
        this.total_belanja = total_belanja;
    }
    
    public void changeMeta(float total_belanja, float jumlah_dibayar){
        this.total_belanja = total_belanja;
        this.jumlah_dibayar = jumlah_dibayar;
    }
    
    public void changeMeta(float total_belanja, float jumlah_dibayar, float kembalian){
        this.total_belanja = total_belanja;
        this.jumlah_dibayar = jumlah_dibayar;
        this.kembalian = kembalian;
    }
}
