package com.displaylistobjectpagination.displaylistobjectpagination.services;
import com.displaylistobjectpagination.displaylistobjectpagination.models.SinhVien;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
@Service
public interface SinhvienService {
	public Page<SinhVien> findPaginated(Pageable pageable);
     
   
}
