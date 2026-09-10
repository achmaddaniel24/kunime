import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:kunime/app/router/nav_ext.dart';
import 'package:kunime/features/home/application/home_feed_providers.dart';
import 'package:kunime/features/home/presentation/sections/ongoing/widgets/ongoing_anime_carousel.dart';
import 'package:kunime/features/home/presentation/sections/ongoing/widgets/completed_anime_carousel.dart';
import 'package:kunime/features/home/presentation/sections/ongoing/widgets/recommendation_anime_list.dart';

class OngoingSection extends ConsumerWidget {
  const OngoingSection({super.key});

  @override
  Widget build(BuildContext context, WidgetRef ref) {
    final ongoing = ref.watch(ongoingAnimeListProvider);
    final completed = ref.watch(completedAnimeListProvider);
    final recommendation = ref.watch(homeRecommendationProvider);
    return Column(
      children: [
        OngoingAnimeCarousel(
          value: ongoing,
          onTapItem: (item) => context.pushAnimeDetail(item.endpoint),
          onSeeAll: () {},
        ),
        CompletedAnimeCarousel(
          value: completed,
          onTapItem: (item) => context.pushAnimeDetail(item.endpoint),
        ),
        // const SizedBox(height: 10),
        RecommendationAnimeList(
          value: recommendation,
          onTapItem: (item) => context.pushAnimeDetail(item.endpoint),
        ),
      ],
    );
  }
}
