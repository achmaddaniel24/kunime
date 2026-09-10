import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:kunime/core/themes/app_tokens.dart';
import 'package:kunime/core/widgets/async_view.dart';
import 'package:kunime/features/home/models/home_ui_models.dart';
import 'package:kunime/features/home/presentation/sections/ongoing/widgets/ongoing_anime_card.dart';
import 'package:kunime/features/home/presentation/sections/ongoing/widgets/ongoing_anime_skeleton_list.dart';

class CompletedAnimeCarousel extends StatelessWidget {
  const CompletedAnimeCarousel({
    super.key,
    required this.value,
    required this.onTapItem,
  });

  final AsyncValue<List<UiCompleted>> value;
  final ValueChanged<UiCompleted> onTapItem;

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Padding(
          padding: EdgeInsets.fromLTRB(16, 20, 16, 12),
          child: Text(
            'Sudah Tamat',
            style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
          ),
        ),
        AsyncView(
          value: value,
          loading: const OngoingAnimeSkeletonList(),
          error: const Padding(
            padding: EdgeInsets.all(16),
            child: Text(
              'Gagal memuat anime yang sudah tamat',
              style: TextStyle(color: AppTokens.onSecondary),
            ),
          ),
          builder: (items) {
            if (items.isEmpty) {
              return const Padding(
                padding: EdgeInsets.all(16),
                child: Text(
                  'Belum ada anime yang sudah tamat',
                  style: TextStyle(color: AppTokens.onSecondary),
                ),
              );
            }

            final data = items.take(8).toList(growable: false);
            return SizedBox(
              height: 200,
              child: ListView.separated(
                scrollDirection: Axis.horizontal,
                padding: const EdgeInsets.symmetric(horizontal: 16),
                itemCount: data.length,
                separatorBuilder: (_, _) => const SizedBox(width: 16),
                itemBuilder: (context, index) {
                  final anime = data[index];
                  return OngoingAnimeCard(
                    layerLink: LayerLink(),
                    imageUrl: anime.image,
                    updateDay: 'Tamat',
                    title: anime.title,
                    episode: '${anime.totalEpisode} Episode',
                    isNewRelease: false,
                    onPressed: () => onTapItem(anime),
                  );
                },
              ),
            );
          },
        ),
      ],
    );
  }
}
