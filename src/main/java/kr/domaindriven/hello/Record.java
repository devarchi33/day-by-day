package kr.domaindriven.hello;

import javax.persistence.*;
import java.time.LocalDateTime;


/**
 * Created by tony on 2016. 1. 22..
 * Changed by jerry on 2016.1. 26.. 엔티티로 수정
 */

@Entity
public class Record {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDateTime date;

    @Enumerated(value = EnumType.STRING)
    private RecordType revenueOrExpense;
    private Won amount;
    private String balance; // TODO #15
    private String summary;
    private String category; // TODO #16

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setRevenueOrExpense(RecordType revenueOrExpense) { this.revenueOrExpense = revenueOrExpense; }

    public void setAmount(Won amount) {
        this.amount = amount;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Record(LocalDateTime date, boolean isRevenue, Won amount, String balance, String summary, String category) {
        this.date = date;
        if(isRevenue){
            revenueOrExpense = RecordType.수입;
        }else {

            revenueOrExpense = RecordType.지출;
        }
        this.amount = amount;
        this.balance = balance;
        this.summary = summary;
        this.category = category;
    }

    public Record() {

    }


    public long getId() {return id;}

    public LocalDateTime getDate() {
        return date;
    }

    public Won getAmount() {
        return amount;
    }

    public String getBalance() {
        return balance;
    }

    public String getSummary() {
        return summary;
    }

    public RecordType getRevenueOrExpense() {
        return revenueOrExpense;
    }

    public String getCategory() {
        return category;
    }
}
