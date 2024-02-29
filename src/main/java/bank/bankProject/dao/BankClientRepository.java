package bank.bankProject.dao;

import bank.bankProject.entity.BankClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankClientRepository extends JpaRepository<BankClient, Integer> {
}
