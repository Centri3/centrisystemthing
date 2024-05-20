DwarfMoon	"Le Close/Lercurnis III IX"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            1.15e-06
	Radius          80
	InertiaMoment   0.4
	Oblateness     (0.096, 0.151, 0.000)
	OblatenessInfo  0
	RotationPeriod  962
	RotationOffset  -30.2
	Obliquity       157
	EqAscendNode    -52.2
	Precession      1

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_le_close.cfg"
		SurfStyle       0.278
		Randomize      (0.963, -0.561, -0.430)
		colorDistMagn   0.0935
		colorDistFreq   8.01
		detailScale     256
		drivenDarkening 0.359
		seaLevel        0.175
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  1
		icecapHeight    0.0517
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.233
		heightTempGrad  0.625
		beachWidth      0.00134
		tropicWidth     0.07
		mainFreq        3.55
		venusFreq       2
		venusMagn       1.11
		mareFreq        0.4
		mareDensity     1
		terraceProb     0.237
		erosion         0
		montesMagn      0.05
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.66
		riversSin       5.9
		riftsMagn       14.5
		riftsFreq       7
		riftsSin        7
		eqridgeMagn     0.0763
		eqridgeWidth    1
		eqridgeModMagn  1.2
		eqridgeModFreq  3.74
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.01
		cracksFreq      0.6
		cracksOctaves   15
		craterMagn      0.3
		craterFreq      2
		craterDensity   1
		craterOctaves   14
		craterRayedFactor 0
		volcanoMagn     0.173
		volcanoFreq     0.756
		volcanoDensity  0.199
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.0886
		volcanoRadius   0.156
		volcanoTemp     411
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
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
		PeriodDays      543.041956
		SemiMajorAxisKm 5628078.2
		Eccentricity    0.79389313
		Inclination     13.740458
		AscendingNode   -272.061069
		ArgOfPericenter -2.7480916
		MeanAnomaly     -112.671756
	}
}

