import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:kunime/features/home/data/datasources/anime_api_client.dart';
import 'package:kunime/features/home/data/datasources/home_core_api_client.dart';
import 'package:kunime/features/home/data/repositories/home_repository.dart';
import 'package:kunime/features/home/data/repositories/home_repository_impl.dart';
import 'package:kunime/features/home/models/genre/ui_genre.dart';
import 'package:kunime/features/home/models/home_ui_models.dart';
import 'package:phosphoricons_flutter/phosphoricons_flutter.dart';

final animeApiClientProvider = Provider<AnimeApiClient>((ref) {
  return AnimeApiClient();
});

final homeCoreApiClientProvider = Provider<HomeCoreApiClient>((ref) {
  return HomeCoreApiClient();
});

final homeRepositoryProvider = Provider<HomeRepository>((ref) {
  return HomeRepositoryImpl(
    animeApiClient: ref.watch(animeApiClientProvider),
    homeCoreApiClient: ref.watch(homeCoreApiClientProvider),
  );
});

final homeBannerProvider = FutureProvider<List<UiBanner>>((ref) async {
  return ref.watch(homeRepositoryProvider).fetchBanners();
});

final ongoingAnimeListProvider = FutureProvider<List<UiOngoing>>((ref) async {
  return ref.watch(homeRepositoryProvider).fetchOngoingAnime();
});

final completedAnimeListProvider = FutureProvider<List<UiCompleted>>((ref) {
  return ref.watch(homeRepositoryProvider).fetchCompletedAnime();
});

final homeRecommendationProvider = FutureProvider<List<UiRecommendation>>((
  ref,
) async {
  return ref.watch(homeRepositoryProvider).fetchRecommendations();
});

final homeGenreProvider = FutureProvider<List<UiGenre>>((ref) async {
  return ref.watch(homeRepositoryProvider).fetchGenres();
});

final homeCategoryProvider = Provider<List<UiCategory>>((ref) {
  return [
    UiCategory(
      id: 'ongoing',
      label: 'Tonton Sekarang',
      icon: PhosphorIcons.fire,
      activeIcon: PhosphorIcons.fireFill,
    ),
    UiCategory(
      id: 'genre',
      label: 'Genre',
      icon: PhosphorIcons.shapes,
      activeIcon: PhosphorIcons.shapesFill,
    ),
    UiCategory(
      id: 'favorite',
      label: 'Tersimpan',
      icon: PhosphorIcons.bookmark,
      activeIcon: PhosphorIcons.bookmarkFill,
    ),
  ];
});
