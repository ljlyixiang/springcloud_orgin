package com.imooc.product;

import com.imooc.product.dataObject.ProductInfo;
import com.imooc.product.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {
		@Autowired
		ProductInfoRepository productInfoRepository;
		@Test
		public void findByProductStatus() {
				List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(1);
				System.out.println(byProductStatus.toString());
				Assert.assertTrue(byProductStatus.size()>0);
		}

}

