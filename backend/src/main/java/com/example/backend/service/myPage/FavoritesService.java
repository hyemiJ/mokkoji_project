package com.example.backend.service.myPage;

import com.example.backend.domain.FavoritesDTO;
import com.example.backend.entity.myPage.Favorites;
import com.example.backend.entity.myPage.FavoritesId;

import java.util.List;

public interface FavoritesService {

	void deleteFavorites(FavoritesId favoritesId) throws Exception;

	void insertFavorites(Favorites favorites);

	int countFavorites(long productId);

	List<FavoritesDTO> userFavorites(String userId);

	int countFavorites(String userId);

	Favorites productFavorites(FavoritesId favoritesId);

}
