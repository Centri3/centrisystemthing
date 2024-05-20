DwarfPlanet	"Mou/Caecus I.FT1"
{
	ParentBody     "Oblitus es"
	Class          "Ferria"
	Mass            0.000246
	Radius          336
	InertiaMoment   0.4
	Obliquity       0.748
	EqAscendNode    -35.7
	TidalLocked     true

	EndogenousHeating 0.05
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.909 0.864)

	Interior
	{
		Composition
		{
			Metals		100
		}
	}

	Surface
	{
		Preset         "caecus_kou_ft_mou.cfg"
		SurfStyle       0.961
		Randomize      (-0.183, -0.955, 0.931)
		colorDistMagn   0.0612
		colorDistFreq   41.5
		detailScale     128
		drivenDarkening 0.191
		seaLevel        0.26
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.779
		icecapHeight    0.0316
		climatePole     1
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.204
		heightTempGrad  0.625
		beachWidth      0.000687
		tropicWidth     0.0611
		mainFreq        1.6
		venusFreq       1.21
		venusMagn       1.37
		mareFreq        0.5
		mareDensity     1
		terraceProb     0.191
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0281
		dunesFreq       3.6
		dunesFraction   0.946
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      63.2
		riversFreq      2.55
		riversSin       6.49
		riftsMagn       9.16
		riftsFreq       3.27
		riftsSin        7.43
		eqridgeMagn     0.42
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  4.12
		canyonsMagn     0.728
		canyonsFreq     0.101
		canyonsFraction 0.231
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   16
		craterRayedFactor 0
		volcanoMagn     0.305
		volcanoFreq     0.779
		volcanoDensity  0.282
		volcanoOctaves  4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.802
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.399
		RoughnessIce    0.234
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2.72897324
		SemiMajorAxis   1.6000001
		Eccentricity    0.0458015267
		Inclination     0.7480916
		AscendingNode   -35.7251908
		ArgOfPericenter -57.7099237
		MeanAnomaly     -30
	}
}

